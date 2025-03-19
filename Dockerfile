# 第一阶段：构建 JAR
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app

# 解决 MAVEN_CONFIG 可能导致的问题
ENV MAVEN_CONFIG "/app/.m2"
RUN mkdir -p "$MAVEN_CONFIG"

# 复制项目代码
COPY . .
RUN ls -l /app

# 确保 mvnw 可执行
RUN chmod u+x mvnw && chmod u+x mvnw.cmd

# 预下载依赖 & 构建 JAR
RUN ./mvnw clean package -DskipTests && ls -l /app
RUN ls -l /app/target

# 第二阶段：运行 Spring Boot
FROM eclipse-temurin:21
WORKDIR /app

# 复制 JAR 文件
COPY --from=build /app/target/eneloop-0.0.1-SNAPSHOT.jar app.jar

# 运行应用
CMD ["java", "-jar", "app.jar"]

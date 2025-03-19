# 第一阶段：构建 JAR
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app

# 复制项目代码
COPY . .

# 确保 mvnw 可执行
#RUN chmod +x mvnw

# 预下载依赖 & 构建 JAR
#RUN ./mvnw clean package -DskipTests

RUN chmod +x mvnw && ./mvnw clean package -DskipTests || tail -n 50 /app/logs

# 第二阶段：运行 Spring Boot
FROM eclipse-temurin:21
WORKDIR /app

# 复制 JAR 文件
COPY --from=build /app/target/eneloop-0.0.1-SNAPSHOT.jar app.jar

# 运行应用
CMD ["java", "-jar", "app.jar"]

# 使用 Maven 官方镜像构建 JAR
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app

# 复制项目代码
COPY . .

# 赋予 mvnw 执行权限
RUN chmod +x mvnw

# 预下载依赖 & 构建 JAR
RUN ./mvnw clean package -DskipTests

# 使用 JDK 运行 Spring Boot
FROM eclipse-temurin:21
WORKDIR /app

# 复制 JAR 文件
COPY --from=build /app/target/eneloop-0.0.1-SNAPSHOT.jar app.jar

# 运行 Spring Boot 应用
CMD ["java", "-jar", "target/*.jar"]

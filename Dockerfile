FROM openjdk:17-jdk-slim
WORKDIR /app

# 复制 Maven Wrapper（如果没有就手动添加到仓库）
COPY .mvn/ .mvn/
COPY mvnw pom.xml ./

# 让 Maven 预下载依赖（加速构建）
RUN ./mvnw dependency:go-offline

# 复制项目代码并编译
COPY src ./src
RUN ./mvnw clean package

# 运行 Spring Boot 应用
CMD ["java", "-jar", "target/*.jar"]

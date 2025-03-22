# Sử dụng OpenJDK 17 (hoặc phiên bản bạn dùng)
FROM openjdk:17-jdk-slim

# Cài Maven để chạy app từ source code (Hot Reload)
RUN apt-get update && apt-get install -y maven

WORKDIR /app

# Copy file cấu hình Maven trước để cache dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy toàn bộ code vào container
COPY . .

# Mở port 8080
EXPOSE 8080

# Chạy ứng dụng bằng Maven (hỗ trợ hot reload)
ENTRYPOINT ["mvn", "spring-boot:run"]

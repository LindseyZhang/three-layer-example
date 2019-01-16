## 基于 spring boot 的三层架构样例

### content
 本样例涉及内容有：
 
 spring boot
 
 mysql
 
 mybatis   
 
 flyway
 
 checkstyle
 
 swagger ui
 
 editor config
  
### 启动步骤
 要求：电脑预装 docker。
 1. 在 docker 中启动 mysql 数据库, 在项目根目录下执行
 ```
docker-compose up -d
```
 2. 启动服务
 
 在 Linux 环境中，在项目根目录下执行
 ```
  ./gradlew bootRun
```

 在 Windows 环境中，在项目根目录下执行
 ```
gradlew.bat bootRun
```
 
### 代码构建时的风格检查
在代码构建时会自动进行代码风格检查，进行代码构建，
 
 在 Linux 环境中，在项目根目录下执行
 ```
  ./gradlew clean build
```

 在 Windows 环境中，在项目根目录下执行
 ```
gradlew.bat clean build
```
 
 
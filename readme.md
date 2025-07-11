# Spring Boot Member API

這是一個使用 Java + Spring Boot + Hibernate + SQL Server 實作的會員系統 API，支援基本會員資料查詢功能。

## 技術棧

- Java 17
- Spring Boot 3.5.3
- Spring Data JPA (Hibernate)
- SQL Server
- Maven
- IntelliJ IDEA
- Git + SourceTree

## 功能說明

### ✅ 查詢會員資料 (GET)
`GET /members/{id}`  
回傳指定會員的 JSON 資料

## 未來擴充
- [ ] POST 新增會員
- [ ] PUT 編輯會員
- [ ] DELETE 刪除會員
- [ ] 使用 Spring Security 加入登入功能

## 如何啟動

1. 設定 `application.properties` 資料庫連線
2. 透過 IntelliJ 啟動 `DemoApplication.java`
3. 使用 Postman 測試 API

---

作者：kuang  


curl -X POST http://localhost:8080/login -H "Content-Type: application/json" -u bbb:bbb -v
curl -X POST http://localhost:8080/api/auth/signup -H "Content-Type: application/json" -d '{"username":"aaaa", "password":"bbbbb"}' -v
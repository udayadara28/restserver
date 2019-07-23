Feature: Rest based Calculator Application

	Scenario: Addition
		Given rest api "http://localhost:9000/api/addition?first=10&second=20"
		When i invoke api
		Then expected result 30.0

	Scenario: Subtraction
		Given rest api "http://localhost:9000/api/subtraction?first=10&second=20"
		When i invoke api
		Then expected result -10.0

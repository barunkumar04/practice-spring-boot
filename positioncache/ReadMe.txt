
# Main Class
	- CourseApiApp

# Urls:

> Get Cache size -  http://localhost:8080/cacheSize/

> Query Position - http://localhost:8080/positions/Account1_Cusip1/

# For following use Postman or like tool:
		- Add a position:
			- Use POST request
			- URL: http://localhost:8080/positions
			- Header: 
				- Content Type: application/json
			- Body:
				- {"account":"Account1","cusip":"Cusip3","quantity":"300"}

		- Delete a topic:
			- Use DEL request
			- URL: http://localhost:8080/positions/invalidate
			- Header: 
				- Content Type: application/json
			- Body:
				- {"id":"big-data","name":"Big Data UPDATED","description":"Big Data Description"}
			

			
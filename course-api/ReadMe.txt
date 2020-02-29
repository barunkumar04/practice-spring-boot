
# Main Class
	- CourseApiApp

# Urls:
	- To list all topics: http://localhost:8080/topics/
	- For following use Postman or like tool:
		- Add a topic:
			- Use POST request
			- URL: http://localhost:8080/topics
			- Header: 
				- Content Type: application/json
			- Body:
				- {"id":"big-data","name":"Big Data","description":"Big Data Description"}
									 
		- Update a topic:
			- Use PUT request
			- URL: http://localhost:8080/topics/big-data
			- Header: 
				- Content Type: application/json
			- Body:
				- {"id":"big-data","name":"Big Data UPDATED","description":"Big Data Description"}

		- Delete a topic:
			- Use DEL request
			- URL: http://localhost:8080/topics/big-data
			- Header: 
				- Content Type: application/json
			- Body:
				- {"id":"big-data","name":"Big Data UPDATED","description":"Big Data Description"}
			

			
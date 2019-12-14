# videogame_data_api
A simple API with REST functions made using Springboot

### VideogamesApiDataApplication.java
<ul><li>Starting point into the application</li></ul>

### DisplayController.java
<ul>
<li>Starting point into app is localhost:8080/showCreate
<li>Controller used to display .jsp files to page</li>
<li>Implements functions to create list of video games</li>
<li>Lets user edit and delete items from a list of video games</li>
</ul>

![showCreate](https://user-images.githubusercontent.com/14893642/70853591-92231100-1e75-11ea-9ed8-842c6ee91597.JPG)
![DisplayVG](https://user-images.githubusercontent.com/14893642/70853600-a404b400-1e75-11ea-9e55-eea55a9405e6.JPG)


### Videogame.java
<ul>
<li>Videogame model with member variables and getters and setters</li>
</ul>

### VideogameController.java
<ul>
<li>Calls the basic REST functions: GET, POST, PUT, DELETE</li>
</ul>

### VideogameRepository.java
<ul>
<li>An interface that extends CrudRepository to get all the basic CRUD functions</li>
</ul>

### VideogameService.java
<ul>
<li>Implements the basic REST operations: GET, POST, PUT, DELETE</li>
</ul>

![PostmanGETfunction](https://user-images.githubusercontent.com/14893642/70853472-17a5c180-1e74-11ea-9c31-f53be450b99c.JPG)

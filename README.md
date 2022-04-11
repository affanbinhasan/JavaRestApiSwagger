# JavaRestApiSwagger
<div id="top"></div>

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/affanbinhasan/JavaRestApiExample">
    <img src="https://miro.medium.com/max/1380/1*aKVg84SP5oPV9fwOnbl6yQ.png" alt="Logo" width="250" height="100">
  </a>

<h3 align="center">Java Rest API with Swagger</h3>

  <p align="center">
    A REST API with endpoints for searching, creating and deleting “server” objects with interactive Swagger UI
    <br />
    <a href="https://github.com/affanbinhasan/JavaRestApi/blob/main/README.md"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/affanbinhasan/JavaRestApiSwagger">View Demo</a>
    ·
    <a href="https://github.com/affanbinhasan/JavaRestApiExample/issues">Report Bug</a>
    ·
    <a href="https://github.com/affanbinhasan/JavaRestApiExample/issues">Request Feature</a>
  </p>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

Rest API with endpoints for searching, creating and deleting “server” objects with Interactive Swagger Ui Integration:
  - Application is developed in java using Spring Boot with Web, Devtools, MongoDB and SpringDocs dependencies.
  - MongoDB repo is used : Sample Data in MongoDB Repo Provided in Screenshots Folder.
  - HTTP GET, PUT, DELETE features are provided
  - Enable us to interact with the Rest Api with url : localhost:8080/swagger-ui.html

<p align="right">(<a href="#top">back to top</a>)</p>

### Built With

* [Java](https://www.java.com/)
* [Spring Framework](https://spring.io/)
* [MongoDB](https://www.mongodb.com/)

<p align="right">(<a href="#top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started

To use this Application:
* Clone my github Repository using this url : https://github.com/affanbinhasan/JavaRestApiSwagger.git .
* Download it as a zip file. Unzip it in your PC and Open it with Visual Studio Code or any IDE of your choice. 
* If you want to run it with your CLI refer this url : https://stackoverflow.com/questions/47835901/how-to-start-up-spring-boot-application-via-command-line .


### Prerequisites

* Java
* Spring Boot
* Any Browser
  
<!-- USAGE-->
## Usage
* Copy and paste this url : localhost:8080/api/swagger-ui.html in your browser after running the apllication.It will have a nice UI to interact with in order to use this Restful Webservice.

* Http features provided (Runs On Default Port 8080):
	- HTTP GET - localhost8080/api/getservers : Return all the servers present in Mongo Repository
	- HTTP GET - localhost8080/api/getserverbyid/{id} : Provide id you want to look up for in the Url
	- HTTP GET - localhost8080/api/getserverbyname/{name} : Provide name you want to look up for in the Url
	- HTTP PUT - localhost8080/api/addserver : Provide a Request Body In Raw Json Format
	- HTTP DELETE - localhost8080/api/deleteserver/{id} : Provide the id you want to delete an entity of.
	- localhost8080/ : gives you all the URIs for navigation.


<p align="right">(<a href="#top">back to top</a>)</p>


<!-- CONTACT -->
## Contact

Affan Bin Hasan - affan.alpha7@gmail.com

Project Link: [https://github.com/affanbinhasan/JavaRestApiExample](https://github.com/affanbinhasan/JavaRestApiSwagger)

<p align="right">(<a href="#top">back to top</a>)</p>


© 2022 GitHub, Inc.
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About


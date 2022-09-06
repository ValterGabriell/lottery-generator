<h1 align="center">Lottery Random Number</h1>
<h4 align="center"> 
    🟢  Project Done  🟢
</h4>

Tabela de conteúdos
=================
<!--ts-->
   * [About](#About)
   * [How to use](#how-to-use)
      * [Endpoints](#Endpoints)  
   * [Tech](#Tech)
   * [Credits](#Credits)
<!--te-->

<h1>About</h1>
<p>The backend is for generate randoms numbers for lottery.
  </br>
<h1>How to use</h1>
<img src="https://user-images.githubusercontent.com/63808405/171037587-3c6b6b8f-e9c3-4b97-b4b0-a54d6c9fb8dc.png" width = "250px"></br>
<p>Before start, you have to download the Insomnia <a href = "https://insomnia.rest/download">here</a>. After this, you must download the MySql workbench following this <a href = "https://www.simplilearn.com/tutorials/mysql-tutorial/mysql-workbench-installation/">manual</a></br>
<h2>Endpoints</h2>
<p>After that, you need to configurate your MySql like this:

```bash
CREATE DATABASE generator_spring
``` 
<p>Then, after that, change some points in your application.properties file:

```bash
spring.datasource.username: past here your database username
spring.datasource.password: past here your database password
``` 

<p>After all this, your can use this url to get the random value:</br>

```bash
http://localhost:8090/generateValue
``` 
The json format that you will see is like

```bash
[
	0,
	0,
	3,
	3,
	0,
	2
]
``` 
<p>If you check your Mysql table "codigos" you must see the new random value</p>

<h1>Tech</h1>
- Spring Boot</br>
- MVC</br>
- Clean Code</br>


<h1>Credits</h1>

---

<a href="https://www.linkedin.com/in/valter-gabriel">
 <img style="border-radius: 50%;" src="https://user-images.githubusercontent.com/63808405/171045850-84caf881-ee10-4782-9016-ea1682c4731d.jpeg" width="100px;" alt=""/>
 <br />
 <sub><b>Valter Gabriel</b></sub></a> <a href="https://www.linkedin.com/in/valter-gabriel" title="Linkedin">🚀</a>
 
Made by Valter Gabriel 👋🏽 Contact me!

[![Linkedin Badge](https://img.shields.io/badge/-Gabriel-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/valter-gabriel/)](https://www.linkedin.com/in/valter-gabriel/) 




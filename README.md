# JerseyEmployeeServiceClient Project

This Java Project is a Restful Webservice Client that connects to an Employee Oracle Database
For The Following Operations (CRUD Operations) on the Employee Database

1- Create Employee Record -> TestClient1

2- Retrieve Employee Record -> TestClient2

3- Update Employee Record -> TestClient3

4- Delete Employee Record -> TestClient4


## Technologies

This project is using Following Technologies

1- JERSEY framework : it is a reference implementation of JAX-RS webservice API.

2- Jackson API : it is a Java Library API used to convert Java Object into JSON and Vice Versa

## Authentication

This Project has also Username Token Security or Basic Authentication to protect webservice against Authentication Attacks.

## How it works ?

1- The Client APP will send an HTTP Request that carry a message of required DB Operation in JSON Format to the webservice Server

2- The message will contain also username and Password for Authentication


## Notes

1- service userName : mahmoud

service password : @123

2- Employee Record in DB contains Following Fields

A- eid (employee id) : Primary Key

B- name

C- salary
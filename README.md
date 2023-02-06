# UserManagement


List of Apis and their description\

default APi:
c

addUser: To add user into the database
http://localhost:8080/addUser

getUser/{<pass userId>}: to get user details with respect to id
http://localhost:8080/getUser/{<userId>}

getAllUser: get all user details exists in database
http://localhost:8080/getAllUser

updateUserInfo: to update user details with id of the user
http://localhost:8080/updateUserInfo/{<userId>}

**pass user details as a object through RequestBody to udate details

deleteUser: delete existing user with given id
http://localhost:8080/deleteUser?id=<userId>

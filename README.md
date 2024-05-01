#### Initial Tables with their respective columns
![ClassroomTableInitial](assests/ClassroomTableInitial.png)
![StudentTableInitial](assests/SubjectTableInitial.png)
![TeacherTableInitial](assests/TeacherTableInitial.png)
![TimeTableInitial](assests/TimeTableInitial.png)

#### Create Teacher 
##### http://localhost:8080/teacher/create
![CreateTeacher](assests/TeacherCreation.png)
![TeacherTableAfterCreation](assests/DeepakTable.png)

#### Create Subject
##### http://localhost:8080/subject/create
![CreateSubject](assests/SubjectCreation.png)
![SubjectTableAfterCreation](assests/SubjectTableUpdated.png)

#### Create Classroom
##### http://localhost:8080/classroom/create
![CreateClassroom](assests/ClassroomCreation.png)
![ClassroomTableAfterCreation](assests/ClassroomTableUpdated.png)

#### Create TimeTable
##### http://localhost:8080/timetableEntry/create
###### input json
![CreateTimeTableJSON](assests/TimeTableCreationInput.png)
###### output json
![CreateTimeTableJSONOutput](assests/TimeTableCreationOutput.png)
![TimeTableAfterCreation](assests/TimeTableUpdated.png)

#### Get Classroom
##### http://localhost:8080/classroom/1
![GetClassroom](assests/ClassroomGet.png)

#### Update Classroom
##### http://localhost:8080/classroom/update
###### Before Update
![UpdateClassroomBefore](assests/ClassroomBeforeUpdate.png)
###### After Update
![UpdateClassroomAfter](assests/ClassroomTableAfterUpdate.png)
![ClassroomUpdateJson](assests/ClassroomUpdateJson.png)

#### Delete Classroom
###### Before Delete
![DeleteClassroomBefore](assests/ClassroomTableBeforeDeletion.png)
###### After Delete
![DeleteClassroomAfter](assests/ClassroomTableAfterDeletion.png)

![DeleteClassroomJson](assests/ClassroomTableDeleteJson.png)

#### Get TimeTable
![GetTimeTable](assests/TimeTableGetOperation.png)

#### Get All TimeTables related to a particular Classroom using Classroom ID 
##### http://localhost:8080/classroom/timetables/1
![GetAllTimeTables](assests/AllTimeTableEntriesByClassroomId.png)

#### Delete TimeTableEntry
###### http://localhost:8080/timetableEntry/3
##### Before Delete
![DeleteTimeTableBefore](assests/TimeTableBeforeDeletion.png)
##### After Delete
![DeleteTimeTableAfter](assests/TimeTableAfterDeletion.png)
![DeleteTimeTableJson](assests/TimeTableDeletionJson.png)
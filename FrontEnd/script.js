function showCourses(){
    fetch("http://localhost:8080/course/availableCourses")
    .then((respone)=>respone.json())
    .then((courses)=>{
        var tableBody=document.getElementById("courseTablebody");
        courses.forEach(element => {
            var row = `<tr>
            <td>${element.courseId}</td>
            <td>${element.courseName}</td>
            <td>${element.trainer}</td>
            <td>${element.durationInWeeks}</td>
            </tr>`
            tableBody.innerHTML+=row;
        });
    })
}

function showEnrolled(){
    fetch("http://localhost:8080/course/enrolled")
    .then((respone)=>respone.json())
    .then((enrolled)=>{
        var tableBody=document.getElementById("enrollTableBody");
        enrolled.forEach(element => {
            var row=`<tr>
            <td>${element.id}</td>
            <td>${element.name}</td>
            <td>${element.emailId}</td>
            <td>${element.courseName}</td>
            </tr>`
            tableBody.innerHTML+=row;
        });
    })
}
import React from "react";

function CourseDetails() {
  const courses = ["React", "Angular", "Vue"];

  return (
    <div>
      <h2>🎓 Course Details</h2>

      {courses.map((course, index) => (
        <p key={index}>{course}</p>
      ))}
    </div>
  );
}

export default CourseDetails;
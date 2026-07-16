import React from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore(props) {
  const average = props.total / props.goal;

  return (
    <div className="box">
      <h2>Student Score Details</h2>
      <p>Name: {props.name}</p>
      <p>School: {props.school}</p>
      <p>Total Marks: {props.total}</p>
      <p>Goal Subjects: {props.goal}</p>
      <h3>Average Score: {average}</h3>
    </div>
  );
}

export default CalculateScore;
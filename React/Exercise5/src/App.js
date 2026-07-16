import React from 'react';
import CohortDetails from './CohortDetails';

function App() {

  const cohort1 = {
    name: "INTADMDF10 - .NET FSD",
    startDate: "22-Feb-2022",
    endDate: "",
    status: "scheduled",
    coach: "Aathma",
    trainer: "Jojo Jose"
  };

  const cohort2 = {
    name: "ADM21JF014 - Java FSD",
    startDate: "10-Sep-2021",
    endDate: "",
    status: "ongoing",
    coach: "Apoorv",
    trainer: "Elisa Smith"
  };

  const cohort3 = {
    name: "CDBJF21025 - Java FSD",
    startDate: "24-Dec-2021",
    endDate: "",
    status: "ongoing",
    coach: "Aathma",
    trainer: "John Doe"
  };

  return (
    <div>
      <h1>Cohorts Details</h1>

      <CohortDetails cohort={cohort1} />
      <CohortDetails cohort={cohort2} />
      <CohortDetails cohort={cohort3} />

    </div>
  );
}

export default App;
import React from 'react';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore 
        name="Sandhyaa"
        school="ABC School"
        total={450}
        goal={5}
      />
    </div>
  );
}

export default App;
import React from "react";

function IndianPlayers() {

  const players = ["Virat", "Rohit", "Gill", "Rahul", "Hardik", "Pant"];

  // Destructuring
  const [p1, p2, p3, p4, p5, p6] = players;

  const oddTeam = [p1, p3, p5];
  const evenTeam = [p2, p4, p6];

  // Two arrays
  const T20players = ["Virat", "Rohit", "Hardik"];
  const RanjiPlayers = ["Pujara", "Rahane", "Iyer"];

  // Merge arrays using spread
  const mergedPlayers = [...T20players, ...RanjiPlayers];

  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        {oddTeam.map((p, i) => <li key={i}>{p}</li>)}
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        {evenTeam.map((p, i) => <li key={i}>{p}</li>)}
      </ul>

      <h2>Merged Players</h2>
      <ul>
        {mergedPlayers.map((p, i) => <li key={i}>{p}</li>)}
      </ul>
    </div>
  );
}

export default IndianPlayers;
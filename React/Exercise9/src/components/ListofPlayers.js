import React from "react";

function ListofPlayers() {

  // Array of players
  const players = [
    { name: "Virat", score: 85 },
    { name: "Rohit", score: 92 },
    { name: "Gill", score: 65 },
    { name: "Rahul", score: 70 },
    { name: "Hardik", score: 55 },
    { name: "Pant", score: 78 },
    { name: "Jadeja", score: 60 },
    { name: "Ashwin", score: 50 },
    { name: "Shami", score: 40 },
    { name: "Bumrah", score: 30 },
    { name: "Siraj", score: 25 }
  ];

  // Filter players < 70 using arrow function
  const lowScorePlayers = players.filter(p => p.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {
          players.map((p, index) => (
            <li key={index}>
              {p.name} - {p.score}
            </li>
          ))
        }
      </ul>

      <h2>Players with Score Below 70</h2>
      <ul>
        {
          lowScorePlayers.map((p, index) => (
            <li key={index}>
              {p.name} - {p.score}
            </li>
          ))
        }
      </ul>
    </div>
  );
}

export default ListofPlayers;
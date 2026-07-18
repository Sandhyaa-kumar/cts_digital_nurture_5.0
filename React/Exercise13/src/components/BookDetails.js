import React from "react";

function BookDetails() {
  const books = [
    { id: 1, name: "React Basics", price: 500 },
    { id: 2, name: "JavaScript Guide", price: 400 },
    { id: 3, name: "Node.js Intro", price: 600 }
  ];

  return (
    <div>
      <h2>📚 Book Details</h2>

      {books.map((book) => (
        <div key={book.id}>
          <p>Name: {book.name}</p>
          <p>Price: ₹{book.price}</p>
          <hr />
        </div>
      ))}
    </div>
  );
}

export default BookDetails;
import React from "react";

function BlogDetails() {
  const blogs = [
    { id: 1, title: "React is Awesome" },
    { id: 2, title: "Understanding ES6" },
    { id: 3, title: "Frontend Tips" }
  ];

  return (
    <div>
      <h2>📝 Blog Details</h2>

      {blogs.map((blog) => (
        <p key={blog.id}>{blog.title}</p>
      ))}
    </div>
  );
}

export default BlogDetails;
import React, { Component } from 'react';
import Post from './Post';

class Posts extends Component {

  constructor() {
    super();

    this.state = {
      posts: [],
      hasError: false
    };
  }

  // 🔹 Fetch API Data
  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => response.json())
      .then(data => {
        const postList = data.map(
          p => new Post(p.id, p.title, p.body)
        );

        this.setState({ posts: postList });
      })
      .catch(error => {
        this.setState({ hasError: true });
      });
  }

  // 🔹 Lifecycle Hook
  componentDidMount() {
    this.loadPosts();
  }

  // 🔹 Error Handling
  componentDidCatch(error, info) {
    alert("Error occurred in component!");
    this.setState({ hasError: true });
  }

  render() {
    if (this.state.hasError) {
      return <h1>Something went wrong!</h1>;
    }

    return (
      <div>
        <h1>Blog Posts</h1>

        {this.state.posts.map(post => (
          <div key={post.id}>
            <h2>{post.title}</h2>
            <p>{post.body}</p>
            <hr />
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;
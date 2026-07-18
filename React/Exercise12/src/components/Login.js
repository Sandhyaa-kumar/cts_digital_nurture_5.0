import React, { Component } from "react";
import GuestPage from "./GuestPage";
import UserPage from "./UserPage";

class Login extends Component {
  constructor() {
    super();
    this.state = {
      isLoggedIn: false
    };
  }

  // Login function
  handleLogin = () => {
    this.setState({ isLoggedIn: true });
  };

  // Logout function
  handleLogout = () => {
    this.setState({ isLoggedIn: false });
  };

  render() {
    let content;
    let button;

    // Conditional Rendering
    if (this.state.isLoggedIn) {
      content = <UserPage />;
      button = <button onClick={this.handleLogout}>Logout</button>;
    } else {
      content = <GuestPage />;
      button = <button onClick={this.handleLogin}>Login</button>;
    }

    return (
      <div>
        <h1>Ticket Booking App</h1>

        {button}
        <hr />
        {content}
      </div>
    );
  }
}

export default Login;
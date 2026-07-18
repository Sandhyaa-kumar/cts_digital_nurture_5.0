import React, { Component } from "react";

class CurrencyConvertor extends Component {
  constructor() {
    super();
    this.state = {
      rupees: "",
      euro: ""
    };
  }

  handleChange = (e) => {
    this.setState({ rupees: e.target.value });
  };

  handleSubmit = (e) => {
    e.preventDefault();
    const euroValue = this.state.rupees / 90;
    this.setState({ euro: euroValue.toFixed(2) });
  };

  render() {
    return (
      <div>
        <h2>Currency Convertor</h2>

        <form onSubmit={this.handleSubmit}>
          <input
            type="number"
            placeholder="Enter Rupees"
            value={this.state.rupees}
            onChange={this.handleChange}
          />

          <button type="submit">Convert</button>
        </form>

        <h3>Euro: {this.state.euro}</h3>
      </div>
    );
  }
}

export default CurrencyConvertor;
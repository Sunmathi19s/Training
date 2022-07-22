import { toHaveAccessibleDescription } from '@testing-library/jest-dom/dist/matchers';
import React, { Component } from 'react'

export default class Content extends Component {
    constructor(props){
        super(props);
        this.state={
            count: 1
        }
    }

    handleClick  = () => {
        console.log('handle click called');
        this.setState({count:this.state.count+1})
    }
  render() {
    return (
      <div>
       <p>We provide One Way and Round trip outstation taxi service at an very low fare. 
        Save more than 40% on One Way taxi booking compared to other drop taxi service provider</p> 
        <p> <button onClick={this.handleClick} className='btn btn-info'>+</button> </p>
        <p> Likes :{this.state.count}</p>
      </div>
    )
  }
}

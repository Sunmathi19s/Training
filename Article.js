import React, { Component } from 'react'
import { Review } from './Review';

export default class Article extends Component {

    constructor(props){
        super(props);
        this.state={
            count: 1  ,
            Dcount :1
        }
    }
    


    handleClick  = () => {
        console.log('handle click called');
        this.setState({count:this.state.count+1})
    }

    handleClick1  = () => {
        console.log('handle click called');
        this.setState({Dcount:this.state.Dcount+1})
    }
    
    
  render() {
    return (
      <div>
       <Review count={this.state.count}  handleClick={this.handleClick} 
       Dcount={this.state.Dcount} handleClick1={this.handleClick1}></Review>
      </div>
    )
  }
}

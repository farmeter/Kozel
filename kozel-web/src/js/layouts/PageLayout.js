import React, { Component } from 'react'
import { Link } from 'react-router-dom'
import { connect } from 'react-redux'

// Layout
import Header from '../components/Header';

console.log("===here is start 333===");

const click = () => {
    console.log("this is click");
}

class PageLayout extends Component {
    render() {
        return (
            <div className="layoutRoot">
                <Header />
                <div className="pageContent">
                    {this.props.children}
                </div>
                <input type={button} onClick={this.click} />?
            </div>
        )
    }
}

export default PageLayout;
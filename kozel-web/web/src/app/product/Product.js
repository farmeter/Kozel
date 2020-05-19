import React, { Component } from 'react';
import '../header/style/MenuItem.css';

class Product extends Component {
    render() {
        const { text, checked, id, onRemove } = this.props;

        const onToggle = (e) => {
            console.log("MenuItem onToggle");
            console.log(e);
        }

        const sampleElements = ['one', 'two', 'three'];

        return (
            <div className="product" onClick={() => onToggle(id)}>
                {sampleElements.map((value, index) => {
                    return <div key={index}>{value}</div>
                })}
            </div>
        );
    }
}

export default Product;
import React, { Component } from 'react';
import '../header/style/MenuItem.css';

class Product extends Component {
    render() {
        const { text, checked, id, onRemove } = this.props;

        const onToggle = (e) => {
            console.log("MenuItem onToggle");
            console.log(e);
        }

        return (
            <div className="product" onClick={() => onToggle(id)}>
                <div className={`menu-text ${checked && 'checked'}`}>
                    <div>{text}</div>
                </div>
            </div>
        );
    }
}

export default Product;
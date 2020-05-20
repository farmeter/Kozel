import React, { Component } from 'react';
import '../header/style/MenuItem.css';
import { getProductList } from '../sample/sampleData'

class Product extends Component {
    render() {
        const { text, checked, id, onRemove } = this.props;

        const onToggle = (e) => {
            console.log("MenuItem onToggle");
            console.log(e);
        }

        const productList = getProductList();

        return (
            <div className="product" onClick={() => onToggle(id)}>
                {productList.map((value, index) => {
                    return <div key={index}>{value}</div>
                })}
            </div>
        );
    }
}

export default Product;
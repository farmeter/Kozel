import React, { Component } from 'react';
import '../header/style/MenuItem.css';
import { getProductList } from '../sample/sampleData'

class Product extends Component {
    render() {
        const { text, checked, id, onRemove } = this.props;

        const onClick = (e) => {
            console.log("Product onToggle");
            console.log(e);
        }

        const productList = getProductList();

        return (
            <div className="product" >
                {productList.map((value, index) => {
                    return <div key={index} onClick={() => onClick(value)}>{value}</div>
                })}
            </div>
        );
    }
}

export default Product;
import React, { Component } from 'react';
import '../style/MenuItem.css';

class MenuItem extends Component {
    render() {
        const { text, checked, id, onRemove } = this.props;

        const onToggle = (e) => {
            console.log("MenuItem onToggle");
            console.log(e);
        }

        return (
            <div className="menu-item" onClick={() => onToggle(id)}>
                <div className="remove" onClick={(e) => {
                    e.stopPropagation(); // onToggle 이 실행되지 않도록 함
                    onRemove(id)}
                }>&times;</div>
                <div className={`menu-text ${checked && 'checked'}`}>
                    <div>{text}</div>
                </div>
                {
                    checked && (<div className="check-mark">✓</div>)
                }
            </div>
        );
    }
}

export default MenuItem;
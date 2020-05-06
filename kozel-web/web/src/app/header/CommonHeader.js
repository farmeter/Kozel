import React from 'react';
import './style/CommonHeader.css';

const CommonHeader = ({form, children}) => {
    return (
        <main className="header-list-template">
            <div className="title">
                Header
            </div>
            <section className="form-wrapper">
                {form}
            </section>
            <section className="items-wrapper">
                { children }
            </section>
        </main>
    );
};

export default CommonHeader;
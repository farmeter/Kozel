import React from 'react';
import '../style/CommonHeader.css';

const CommonHeader = ({form, children}) => {
    return (
        <main className="header-list-template">
            <div className="logo">
                <img width="100" src="https://www.pngitem.com/pimgs/m/485-4852378_sample-logo-png-transparent-png.png" />
            </div>
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
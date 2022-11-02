import { useEffect, useState } from "react";
import { Button } from "react-bootstrap";
import styles from "./Header.css";

function Header(props){

    //로그인버튼
    const loginBtnClicked = (event) => {
        event.preventDefault();
        props.setShowLoginModal(true);
    
    };

    return (
        <div className={styles.header}>
            <h1>Header</h1>
            <Button variant="dark" className={styles.searchBtn} id="button-search" size="lg" active
                        href="/signin" onClick={loginBtnClicked} >
                        로그인
                        </Button>
        </div>
    );
}

export default Header;
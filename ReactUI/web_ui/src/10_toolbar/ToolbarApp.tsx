import { useState } from "react";
import Toolbar from "./Toolbar";

function ToolbarApp(){
    const [isLoggedIn, setIsLoggedIn] = useState(false);

    const onClickLogin = () =>{
        setIsLoggedIn(true);
    };
    const onClickLogout = () =>{
        setIsLoggedIn(false);
    }

    return(
        <div>
            <Toolbar
                isLoggedIn={isLoggedIn}
                onClickLogin={onClickLogin}
                onClickLogout={onClickLogout} />
            <div>hello react....</div>
        </div>
    );

}

export default  ToolbarApp;
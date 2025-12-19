import About from "./About";
import Help from "./Help";
import Home from "./Home";

import { BrowserRouter, Link, Route, Routes } from "react-router";

//https://reactrouter.com/
//npm i react-router
function RouterApp() {
 
  return (
    <BrowserRouter>
    <ul>
        <li>
          <Link to="/">홈</Link>
        </li>
        <li>
          <Link to="/about">about</Link>
        </li>
        <li>
          <Link to="/help">help</Link>
        </li>
    </ul>
    <Routes>
      <Route path="/" element={<Home />} />
      <Route path="/about" element={<About />} />
      <Route path="/help" element={<Help />} />
    </Routes>
    </BrowserRouter>
  );
}
export default RouterApp;
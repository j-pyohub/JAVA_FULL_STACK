// import { StrictMode } from 'react'
// import { createRoot } from 'react-dom/client'
// import './index.css'
// //import BookApp from './02_component/BookApp'
//  //import ClassComponentApp from './02_component/ClassComponentApp'
// //import UserApp from './01_simple/UserApp.tsx'
// // import SimpleApp from './01_simple/SimpleApp'
// // import App from './App.tsx'

import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
//import TimeApp from "./03_state/TimeApp";
import StateApp from "./03_state/StateApp";

//state
createRoot(document.getElementById("root")!).render(
  <StrictMode>
    <StateApp />
  </StrictMode>
)


//state 변경에 따른 UI 업데이트 처리 - 1초마다 현재 시간으로 갱신
// setInterval(() => {
//   createRoot(document.getElementById("root")!).render(
//     <StrictMode>
//       <TimeApp />
//     </StrictMode>
//   ) 
// }, 1000);


// //main은 습관적으로 시작 포인트 하나만 만들기
// createRoot(document.getElementById('root')!).render(
//   <StrictMode>

//     {/* <BookApp /> */}
//     {/* <ClassComponentApp /> */}
//     {/* <UserApp /> */}
//     {/* <SimpleApp /> */}
//     {/* <App /> */}
//   </StrictMode>,
// )

import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import BookApp from './02_component/BookApp'
 //import ClassComponentApp from './02_component/ClassComponentApp'
//import UserApp from './01_simple/UserApp.tsx'
// import SimpleApp from './01_simple/SimpleApp'
// import App from './App.tsx'
//main은 습관적으로 시작 포인트 하나만 만들기
createRoot(document.getElementById('root')!).render(
  <StrictMode>
    <BookApp />
    {/* <ClassComponentApp /> */}
    {/* <UserApp /> */}
    {/* <SimpleApp /> */}
    {/* <App /> */}
  </StrictMode>,
)

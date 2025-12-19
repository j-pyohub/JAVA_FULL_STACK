import { useReducer } from "react";
function reducer(state: { value: number }, action : { type: 'TypeA' |'TypeB' }) : { value: number }{
    switch(action.type){
        case "TypeA" :
            return { value : state.value +1};
        case "TypeB" :
            return { value : state.value -1};
        default:
            return state;    
    }
}
const ReducerCounterApp = ()=>{
    const [state, dispatch] = useReducer(reducer, {value:0});
    return(
        <div>
            <p>count : {state.value}</p>
            <button onClick = {() =>dispatch({type:'TypeA'})}>입장(+1)</button>
            <button onClick = {() =>dispatch({type:'TypeB'})}>퇴장(-1)</button>
        </div>
    );
}
export default ReducerCounterApp;
import ClassCounter from "./ClassCounter";
import FunctionState from "./FunctionState";

export default function StateApp() {
    let fName = "stateApp";
    const buttonHandling = () => {
        fName = "new Message";
        console.log(fName);
    }

    return (
        <>
            <h1>function state - {fName}</h1>
            <button onClick={buttonHandling}>function state change</button>

            <ClassCounter />
            <br />
            <br />
            <FunctionState />
        </>
    )
}
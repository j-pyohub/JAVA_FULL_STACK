import { useState } from "react";

export default function FunctionState() {
    //setState = buttonHandling
    const [isButtonFlag, buttonState] = useState<boolean>(false); //<boolean> 으로 타입 지정은 필수X 이미 false로 됨

    const buttonHandling = () => {
        buttonState(!isButtonFlag); //현재 상태의 반대로 변경
    }

    return (
        <button onClick={buttonHandling}>
            {isButtonFlag ? "Click" : "NoClick"}
        </button>
    );
}
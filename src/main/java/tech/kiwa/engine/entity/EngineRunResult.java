package tech.kiwa.engine.entity;

//运行结果 pojo
public class EngineRunResult {
    private RESULT result = RESULT.EMPTY;
    private String result_desc; //对应 RESULT 的 defaultDesc，即字符串表示的结果类型
    private String sequence; //TODO：作用？？？

    public RESULT getResult() {
        return result;
    }

    public void setResult(RESULT result) {
        this.result = result;
    }

    //TODO：该方法有问题
    public void setResult(String result) {
        boolean bRet = this.result.typeFromStringToInt(result);
        if (!bRet) {
            this.result.typeFromIntToString(Integer.parseInt(result));
        }
    }

    public void setResult(int result) {
        this.result.typeFromIntToString(result);
    }

    public String getResult_desc() {
        return result_desc;
    }

    public void setResult_desc(String result_desc) {
        this.result_desc = result_desc;
        this.result.typeFromStringToInt(result_desc);
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }
}

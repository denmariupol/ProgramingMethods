package Chapter_5_Inner_Classes.Variant_A.Task_3;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ingener_mobil on 06.11.2016.
 */
public class Account {
    private int id;
    private int money;
    private Operation operation;
    private ArrayList<Operation> operations = new ArrayList<Operation>();

    public Account() {
        this.id = new java.util.Random().nextInt(10000);
        this.money = new java.util.Random().nextInt(100);
        Init();
    }

    private class Operation{
        private int operationsCash;
        private String operationsDescription;
        private Action actions;

        private void AddAction(int value,Action a,String descr){
            this.operationsCash = value;
            this.actions = a;
            this.operationsDescription = descr;
            switch (a) {
                case CASHIN:
                    money += value;
                    break;
                case CASHOUT:
                    money -= value;
                    break;
                case PAYMENT:
                money -= value;
                break;
            }
        }
    }
    public void Init(){
        operation = new Operation();
    }
    public void Action(int value,Action a,String descr){
        operation.AddAction(value,a,descr);
        operations.add(operation);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Аккаунт: "+id+" Средства: "+money+"\n");
        for (Operation op : operations) {
            sb.append("Сумма операции: "+op.operationsCash+"\n"+" Тип операции:"+op.actions.getAction(op.actions)+"\n"+" Описание:"+op.operationsDescription+"\n");
        }
        return sb.toString();
    }
}

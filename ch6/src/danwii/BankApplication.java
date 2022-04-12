package danwii;
import java.util.Scanner;
import danwii.Account;
public class BankApplication {
    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean run = true;
        while(run) {
            System.out.println("------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 |3. 입금 | 4. 출금 | 5.종료");
            System.out.println("------------------------------------------");
            System.out.print("선택> ");
            int selectNo = scanner.nextInt();
            if(selectNo == 1) {
                createAccount();
            } else if(selectNo == 2) {
                accountList();
            } else if(selectNo == 3) {
                deposit();
            } else if(selectNo == 4) {
                withdraw();
            } else if(selectNo == 5) {
                run = false;
            }
      }
        System.out.println("프로그램 종료");
   }
    private static void createAccount() {
    	System.out.println("***************");
    	System.out.println("*** 계좌 생성 ***");
    	System.out.println("***************");
       	System.out.println("계좌번호 : ");
    	String ano = scanner.next();
    	System.out.println("예금주 : ");
    	String owner = scanner.next();
    	System.out.println("초기 입금액 : ");
    	int balance = scanner.nextInt();
    	Account account = new Account(ano, owner, balance);
    	for(int i=0;i<accountArray.length; i++) {
    		if(accountArray[i] == null) {	
    			accountArray[i] = account;
    			System.out.println("계좌생성 성공~!");
    			break;
    			}
    		}
    	}
    private static void accountList() {
    	System.out.println("***************");
    	System.out.println("*** 계좌 목록 ***");
    	System.out.println("***************");
       	for(int i=0;i<accountArray.length;i++) {
    		if(accountArray[i] != null) {
    			System.out.println(accountArray[i].getAno()+"\t"+
    			accountArray[i].getOwner()+"\t"+
    			accountArray[i].getBalance());
    		} else {
    			break;
    		}
    	}
    }
    private static void deposit() {
    	System.out.println("***************");
    	System.out.println("*** 입금 하기 ***");
    	System.out.println("***************");
       	System.out.println("계좌 번호 : ");
    	String ano = scanner.next();
       	System.out.println("입금액 : ");
    	int balance = scanner.nextInt();
       	Account account = findAccount(ano);   	
    	if(account == null) {
    		System.out.println("해당 계좌가 존재하지 않습니다.");
    		return;
    	}   	
    	account.setBalance(account.getBalance() + balance);
    	System.out.println("입금처리가 성공적으로 완료되었습니다.");
    	}
    private static void withdraw() {
    	System.out.println("***************");
    	System.out.println("*** 출금 하기 ***");
    	System.out.println("***************");
       	System.out.println("계좌 번호 : ");
    	String ano = scanner.next();
    	System.out.println("출금액 : ");
    	int balance = scanner.nextInt();    	
    	Account account = findAccount(ano);   	
    	if(account == null) {
    		System.out.println("해당 계좌가 존재하지 않습니다.");
    		return;
    	}   	
    	account.setBalance(account.getBalance() - balance);
    	System.out.println("출금처리가 성공적으로 완료되었습니다.");
    	}
    private static Account findAccount(String ano) {
    	Account account = null;
    	for(int i=0;i<accountArray.length;i++) {
    		if(accountArray[i] != null) {
    			if(accountArray[i].getAno().equals(ano)) {
    				account = accountArray[i];
    				break;
    			}
    		}
    	}    	return account;
    }
}
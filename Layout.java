import java.awt.*;               //here we have import awt and swing package
import java.awt.event.*;

import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.*;
import java.io.*;
import java.nio.file.*;

public class Layout extends JFrame {

	private Entry [] entryArray = new Entry[10000];      //create Array
	public int cur=0;
    protected JLabel lblStudentId;                //Here, we have create different labels in the JFrame
    protected JLabel lblStudentName;

    protected JLabel lblentryNumber;
    protected JLabel lblentryNumberValue;

    protected JLabel lblentryDate;
    protected JTextField txtentryDate;

    protected JLabel lblName;
    protected JTextField txtName;

    protected JLabel lblContactNumber;
    protected JTextField txtContactNumber;

    protected JLabel lblAddress;
    protected JTextField txtAddress;


    protected JLabel lblHorse_power;
    protected JTextField txtHorse_power;

    protected JLabel lblZones;
    protected JTextField txtZones;

    protected JLabel lblOutlets;
    protected JTextField txtOutlets;

    protected JLabel lblInstlPeriod;

    protected JLabel lblstartDate;
    protected JTextField txtstartDate;
    protected JLabel lblendDate;

    protected JTextField txtendDate;

    protected JTextArea Message;
    protected JTextArea texttoshow;

    protected JButton btnClear;
    protected JButton btnExit;
    protected JButton btnAddEntry;
    protected JButton btnshowentries;
    protected JButton btnsearch;
    protected JButton btnload;
    protected JButton btnsave;

    protected JPanel pnlInfor;
    protected JPanel pnlACInfor;
    protected JPanel pnlConbine1;
    protected JPanel pnlConbine2;
    protected JPanel pnlConbine3;
    protected JPanel pnlConbine4;
    protected JPanel pnlConbine5;
    protected JPanel pnlwholeEntry;
    protected JPanel pnlPeriod;
    protected JPanel pnlPeriod1;
    protected JPanel pnlControlBar;

    public Layout()
    {
        super("CQ Air Conditioning Installation");

        lblStudentId = new JLabel("                         ID:12098197\n");
        lblStudentName = new JLabel("                                                 Abhi Patel");

        lblentryNumber = new JLabel("  Entry Number");     //Here, we have given name to a label
        int entryNumber = Entry.getcurEntry();
        lblentryNumberValue = new JLabel(entryNumber + "");

        lblentryDate = new JLabel("  Date");     //Here, we have given name to a label
        txtentryDate = new JTextField(25);       //In this line we have declared textfield size of technician name field

        lblName = new JLabel("  Technician Name");    //Here, we have given name to a label
        txtName = new JTextField(25);         //In this line we have declared textfield size

        lblContactNumber = new JLabel("  Contact Number");  //Here, we have given name to a label
        txtContactNumber = new JTextField(25);           //In this line we have declared textfield size

        lblAddress = new JLabel("  Address of Installation");
        txtAddress = new JTextField(25);

        pnlInfor = new JPanel();
        pnlInfor.setLayout(new GridLayout(6,2,-90,5));   //here, we have set gridLayout in the JFrame
        pnlInfor.add(lblStudentName);
        pnlInfor.add(lblStudentId);
        pnlInfor.add(lblentryNumber);
        pnlInfor.add(lblentryNumberValue);
        pnlInfor.add(lblentryDate);
        pnlInfor.add(txtentryDate);
        pnlInfor.add(lblName);
        pnlInfor.add(txtName);
        pnlInfor.add(lblContactNumber);
        pnlInfor.add(txtContactNumber);
        pnlInfor.add(lblAddress);
        pnlInfor.add(txtAddress);
        //pnlInfor.setPreferredSize(new Dimension(400, 200));
        //pnlInfor.setMaximumSize(pnlInfor.getPreferredSize());
        //pnlInfor.setMinimumSize(pnlInfor.getPreferredSize());

        lblHorse_power = new JLabel("  Horse Power of AC");   //Here, we have given name to the lblHorse_power label
        txtHorse_power = new JTextField(25);              //In this line we have declared textfield size
        lblZones = new JLabel("  Number of Zones in AC");  //Here, we have given name to lblZones label
        txtZones = new JTextField(25);                      //In this line we have declared textfield size
        lblOutlets = new JLabel("  Number of Outlets in AC");     //Here, we have given name to the txtOutlets label
        txtOutlets = new JTextField(25);                    //In this line we have declared textfield size

        pnlACInfor = new JPanel();
        pnlACInfor.setLayout(new GridLayout(3, 2,-90,5));
        pnlACInfor.add(lblHorse_power);
        pnlACInfor.add(txtHorse_power);
        pnlACInfor.add(lblZones);
        pnlACInfor.add(txtZones);
        pnlACInfor.add(lblOutlets);
        pnlACInfor.add(txtOutlets);
        //pnlACInfor.setPreferredSize(new Dimension(100, 200));
       // pnlACInfor.setMaximumSize(pnlACInfor.getPreferredSize());
        //pnlACInfor.setMinimumSize(pnlACInfor.getPreferredSize());

        pnlConbine1=new JPanel();
        pnlConbine1.setLayout(new BorderLayout(50,10));
        //pnlConbine1.setLayout(new GridLayout(1,2,0,5));
        pnlConbine1.add(pnlInfor, BorderLayout.NORTH);
        pnlConbine1.add(pnlACInfor, BorderLayout.SOUTH);

        lblInstlPeriod = new JLabel(" Installation Period");
        lblstartDate = new JLabel("  Start Date");
        txtstartDate = new JTextField(25);
        lblendDate = new JLabel("  End Date");
        txtendDate = new JTextField(25);

        pnlPeriod = new JPanel();
        pnlPeriod.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        pnlPeriod.add(lblInstlPeriod);

        pnlPeriod1 = new JPanel();
        pnlPeriod1.setLayout(new GridLayout(3, 2,-100,5));
        pnlPeriod1.add(lblstartDate);
        pnlPeriod1.add(txtstartDate);
        pnlPeriod1.add(lblendDate);
        pnlPeriod1.add(txtendDate);

        pnlConbine2 = new JPanel();
        pnlConbine2.setLayout(new BorderLayout());
        pnlConbine2.add(pnlPeriod, BorderLayout.NORTH);
        pnlConbine2.add(pnlPeriod1, BorderLayout.SOUTH);

        pnlwholeEntry = new JPanel();
        pnlwholeEntry.setLayout(new BorderLayout());
        pnlwholeEntry.add(pnlConbine1, BorderLayout.NORTH);
        pnlwholeEntry.add(pnlConbine2, BorderLayout.SOUTH);

        Message = new JTextArea(24,35);
        Message.setBackground(Color.LIGHT_GRAY);
        Message.setForeground(Color.black);
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        Message.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        texttoshow = new JTextArea(24, 35);
        pnlConbine3 = new JPanel();
        pnlConbine3.add(new JScrollPane(Message));

        pnlConbine4 = new JPanel();
        pnlConbine4.setLayout(new BorderLayout());
        pnlConbine4.add(pnlwholeEntry, BorderLayout.WEST);
        pnlConbine4.add(pnlConbine3, BorderLayout.EAST);

        btnAddEntry = new JButton("Add Entry");
        btnClear = new JButton("Clear");
        btnExit = new JButton("Exit");
        btnshowentries = new JButton("Show Entries");
        btnsearch = new JButton("Search");
        btnload = new JButton("Load");
        btnsave = new JButton("Save");
        pnlControlBar = new JPanel();
        pnlControlBar.setLayout(new FlowLayout(FlowLayout.LEFT, 40, 10));
        pnlControlBar.add(btnAddEntry);
        pnlControlBar.add(btnload);
        pnlControlBar.add(btnsave);
        pnlControlBar.add(btnsearch);
        pnlControlBar.add(btnshowentries);
        pnlControlBar.add(btnClear);
        pnlControlBar.add(btnExit);




        pnlConbine5 = new JPanel();
        pnlConbine5.setLayout(new BorderLayout());
        pnlConbine5.add(pnlConbine4, BorderLayout.NORTH);
        pnlConbine5.add(pnlControlBar, BorderLayout.SOUTH);

        this.add(pnlConbine5);
        this.addListeners();
        this.load();
        this.toempty();
    }

    public void addListeners()    //Here, we have declared ActionListener for each button.
    {

        btnClear.addActionListener((ActionEvent e) ->      //In this ActionListener, when user click clear button, it will call clear() method and erase all details.
        {
            clear();     //this is clear() method .
        }
      	);

        btnAddEntry.addActionListener((ActionEvent e)->  //In this ActionListener, when user click Add Entry button, it will call EntryListener() method and add all detalis to the text area.
        {
        	EntryListener();
        }
        );

        btnshowentries.addActionListener((ActionEvent e) ->  //In this ActionListener, when user click on the show Detais button, it will call showDetails() method
        {                                                     // and whatever entries user entered, it will display in the text area.
        	showdetails();         //it is method.
        }
        );

        btnExit.addActionListener((ActionEvent e) ->         //In this ActionListener, when user click on the exit button, it will show a GUI dialog box with below message.
        {
            JOptionPane.showMessageDialog(new JFrame(), "Thank you for using CQ Air Conditioning Installation ", "CQ Air Conditioning Installation ", JOptionPane.PLAIN_MESSAGE);
             //Above line will excute when the user click exit buton and it will give output as GUI dialog box
            System.exit(0);
        }
        );

        btnload.addActionListener((ActionEvent e) ->       //In this ActionListener, when user click in the load button all the data which is saved in the file will load in text area.
        {
        	load();   //this is method for the button.
        }
        );

        btnsave.addActionListener((ActionEvent e) ->    //In this ActionListener, when user click on the button whatever entry user has entered at that time it will save to the file.
        {
        	save();       //this is method for the button.
        }
        );

        btnsearch.addActionListener((ActionEvent e) ->    //In this ActionListener, when user click on the search button, it will show a GUI dialog box with text field to search technician name.
        {
        	search();     //this is method for the button.
        }
        );
    }
    //implements ActionListener
    public void EntryListener()
    {

       // @Override
            Message.setText("");

            if(checkFields())
            {
            Entry aEntry = doEntry();

            clear();
            int entryNumber = Entry.getcurEntry();
            lblentryNumberValue.setText(entryNumber + "");
            Message.setText(aEntry.toString());
            JOptionPane.showMessageDialog(new JFrame(),"Your details has been successfully entered.", "Notification", JOptionPane.PLAIN_MESSAGE);
     		}

    }

    public void clear()      //here, this method will excute when clear button click
    {
        txtentryDate.setText("");        //here, when user click on clear button, all data in textfield will clear
        txtName.setText("");
        txtContactNumber.setText("");
        txtAddress.setText("");
        txtHorse_power.setText("");
        txtZones.setText("");
        txtOutlets.setText("");
        txtstartDate.setText("");
        txtendDate.setText("");
        Message.setText("");
    }

    public Entry doEntry() {

        String entryDate;
        entryDate = txtentryDate.getText();
        InstlDetails technician = new InstlDetails();
        technician.setName(txtName.getText());
        technician.setContactNumber(txtContactNumber.getText());
        technician.setstartDate(txtstartDate.getText());
        technician.setendDate(txtendDate.getText());

        Address aAddress = new Address();
        aAddress.setAdrsOfInstl(txtAddress.getText());
        aAddress.setHorse_power(Integer.parseInt(txtHorse_power.getText()));
        aAddress.setZones(Integer.parseInt(txtZones.getText()));
        aAddress.setOutlets(Integer.parseInt(txtOutlets.getText()));
        Entry aEntry=new Entry(entryDate,technician,aAddress);
        entryArray[cur++]=aEntry;
        //toempty();
        write();
        return aEntry;
    }

		private void appendLine()
		{
			texttoshow.append("\n-------------------------------------------------------------------------------------------\n");
		}

    public void showdetails()
    {
    	texttoshow.setText("");
    	if(cur == 0)
    	{    // below, line will show the GUI, when user click on the showentry button without entring any entry.
			JOptionPane.showMessageDialog(new JFrame(), "There is no ay entry entred after your last visit.", "Notification", JOptionPane.PLAIN_MESSAGE);
			Message.setText(" ");
			return;
		}

		texttoshow.setText("New entries intered after your last visit:\n");

    	for(int i=0;i<cur;i++)
    	{
    		//entryArray[i].getAddress().getAdrsOfInstl()+" "+entryArray[i].getInstlDetails().getName()+" "+entryArray[i].getInstlDetails().getcontactNumber();
    		//texttoshow.append(String.format("%s % s %s\n", entryArray[i].getAddress().getAdrsOfInstl(),entryArray[i].getInstlDetails().getName(),entryArray[i].getInstlDetails().getcontactNumber()));
    		texttoshow.setText(texttoshow.getText()+"\n"+" Entry :"+(i+1));
    		texttoshow.setText(texttoshow.getText()+"\n"+" Address: "+entryArray[i].getAddress().getAdrsOfInstl());
    		texttoshow.setText(texttoshow.getText()+"\n"+" Name: "+entryArray[i].getInstlDetails().getName());
    		texttoshow.setText(texttoshow.getText()+"\n"+" Cont No.: "+entryArray[i].getInstlDetails().getContactNumber());
    		texttoshow.setText(texttoshow.getText()+"\n"+" Horse Power: "+entryArray[i].getAddress().getHorse_power());
			texttoshow.setText(texttoshow.getText()+"\n"+" Zones: "+entryArray[i].getAddress().getZones());
			texttoshow.setText(texttoshow.getText()+"\n"+" Outlets: "+entryArray[i].getAddress().getOutlets());
			texttoshow.setText(texttoshow.getText()+"\n"+" Starting Date: "+entryArray[i].getInstlDetails().getstartDate());
			texttoshow.setText(texttoshow.getText()+"\n"+" Ending Date: "+entryArray[i].getInstlDetails().getendDate());
			System.out.println("                            ");
    		appendLine();
    	}
    	Message.setText(texttoshow.getText());

    }

    protected boolean checkFields() {      //this method will execute when user click on the addentry button without entring any single information.

        /*return checkentryDate() & checkName() & checkContactNumber()
                & checkAddress() & checkstartDate() & checkendDate()
                & checkHorse_power() & checkZones() & checkOutlets();*/
        if(txtentryDate.getText().equals("") || txtName.getText().equals("") || txtContactNumber.getText().equals("") ||
        		txtAddress.getText().equals("") || txtstartDate.getText().equals("") || txtendDate.getText().equals("") ||
        		txtHorse_power.getText().equals("") || txtZones.getText().equals("") || txtOutlets.getText().equals(""))
        {
        	String s = "You must enter ";

        	if(txtentryDate.getText().equals(""))
        	s = s + " Enter Date,";

        	if(txtName.getText().equals(""))
        	s = s + "Technician Name,";

        	if(txtContactNumber.getText().equals(""))
        	s = s + " Contact Number,";

        	if(txtAddress.getText().equals(""))
        	s = s + " Address,";

        	if(txtstartDate.getText().equals(""))
        	s = s + " Start Date,";

        	if(txtendDate.getText().equals(""))
        	s = s + " End Date,";

        	if(txtHorse_power.getText().equals(""))
        	s = s + " Hourse Power,";

        	if(txtZones.getText().equals(""))
        	s = s + " Zones,";

        	if(txtOutlets.getText().equals(""))
        	s = s + " Outlets,";

        	//s = s.replace((char) (s.length() -1), '.');
        	JOptionPane.showMessageDialog(new JFrame(),s, "Warning", JOptionPane.ERROR_MESSAGE);
        	return false;
        }
        return true;

    }

    protected boolean checkentryDate() {
        // no values in the field- not fully checking for day, month and year
        if (txtentryDate.getText().equals("")) {
            Message.setText(Message.getText() + " \n  Enter date.\n");

            return false;
        } else {
            return true;
        }
    }

    protected boolean checkName() {
        if (txtName.getText().equals("")) {
            Message.setText(Message.getText() + "  Enter Technician name.\n");

            return false;
        } else {
            return true;
        }
    }

    protected boolean checkContactNumber() {
        if (txtContactNumber.getText().equals("")) {
            Message.setText(Message.getText() + "  Enter Technician's contact number.\n");

            return false;
        } else {
            return true;
        }
    }

    protected boolean checkAddress() {
        if (txtAddress.getText().equals("")) {
          Message.setText(Message.getText() + "  Enter installation address.\n");

            return false;
        } else {
            return true;
        }
    }

    protected boolean checkstartDate() {
    	if (txtstartDate.getText().equals("")) {
            Message.setText(Message.getText() + "  Enter start date of installation.\n");

            return false;
        } else {
            return true;
        }
    }



    protected boolean checkendDate() {
    	if (txtendDate.getText().equals("")) {
            Message.setText(Message.getText() + "  Enter end date of installation.\n");

            return false;
        } else {
            return true;
        }
    }

    protected boolean checkHorse_power() {
    	if (txtHorse_power.getText().equals("")) {
            Message.setText(Message.getText() + "  Enter Horsepower of AC.\n");

            return false;
        } else {
            return true;
        }
    }

    protected boolean checkZones() {
    	if (txtZones.getText().equals("")) {
            Message.setText(Message.getText() + "  Enter zones of AC.\n");

            return false;
        } else {
            return true;
        }
    }

    protected boolean checkOutlets() {
    	if (txtOutlets.getText().equals("")) {
            Message.setText(Message.getText() + "  Enter Outlets of AC.\n");

            return false;
        } else {
            return true;
        }
    }
    public void toempty()
    {
		try
		{
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("cur_details.txt"));
            bufferedWriter.write("");
            bufferedWriter.close();
		}
		catch(IOException ex)
		{
            System.out.println("Error writing to file");
        }

    }
    public void load()  //this method has written for the load button.
    {
    	BufferedReader reader;
        try {
            reader=new BufferedReader(new FileReader("details.txt")); // in this line, we read data from the text file
            String line;
            Message.setText("      Total Records till now");
            int t=1;
            while((line = reader.readLine())!=null)   //in this while loop, all line are checking whether it null or have information and it is displaing in the text area.
            {

            	Message.setText(Message.getText()+"\n"+" Entry :"+t+"\n");
            	Message.setText(Message.getText()+"    "+line+"\n");
            	line = reader.readLine();
            	line = reader.readLine();

            	Message.setText(Message.getText()+"    "+line+"\n");
            	line = reader.readLine();
            	Message.setText(Message.getText()+"    "+line+"\n");
            	line = reader.readLine();
            	Message.setText(Message.getText()+"    "+line+"\n");
            	line = reader.readLine();
                Message.setText(Message.getText()+"    "+line+"\n");
                line = reader.readLine();
                Message.setText(Message.getText()+"    "+line+"\n");
                line = reader.readLine();
                Message.setText(Message.getText()+"    "+line+"\n");
                t++;

            }
            reader.close();
        }
        catch(FileNotFoundException ex) {     //this catch  will execute when above try section will not run.
           JOptionPane.showMessageDialog(new JFrame(),"Unable to open file data.", "Notification", JOptionPane.ERROR_MESSAGE);  //System.out.println("Unable to open file");
        }
        catch(IOException ex) {
            System.out.println("Error reading file");
        }
    }

    public void save()  //this method has written for the save button.
    {
    	try
    	{
    		BufferedReader reader=new BufferedReader(new FileReader("cur_details.txt")); //this line will read data from Cur_details file.
			BufferedWriter writer = new BufferedWriter(new FileWriter("details.txt",true));  //this line will write data in details file.
            String line;
            Message.setText(" New Saved Data :\n");
            int t=1;
            while((line=reader.readLine())!=null)  //this line of code for the write every line in the details files.
            {
            	if(line.indexOf("Technician Name")==0)
                {
                	Message.setText(Message.getText()+"\n Entry : "+t+"\n");
                	t++;
                }
            	//Message.setText(Message.getText()+"\nEntry : "+t+"\n");
            	Message.setText(Message.getText()+"    "+line+"\n");
            	writer.write(line);
                writer.newLine();
            }
            if(t==1)
            {
            	Message.setText(" ");
            	JOptionPane.showMessageDialog(new JFrame(), "There is no any entry to be stored.", "Notification", JOptionPane.PLAIN_MESSAGE); //this dialog bo will appear when there is not any entry to be enter.
            }
            reader.close();
            writer.close();
        }
    	catch(FileNotFoundException ex)   //this catch  will execute when above try section will not run.
    	{
            System.out.println("Unable to open file");
        }
        catch(IOException ex)    //this catch  will execute when above try section will not run.
        {
            System.out.println("Error reading file");
        }
    	toempty();
    }

    public void search()
    {
    	String Technicianname = JOptionPane.showInputDialog(new JFrame(),"Enter a technician name to search","search",JOptionPane.PLAIN_MESSAGE);

		if(Technicianname.equals("")) 	// check whether user entered technician name or not?
		{
			JOptionPane.showMessageDialog(new JFrame(),"You must enter a search name","Warning",JOptionPane.ERROR_MESSAGE);
			return ;
		}
		String line;
		try
		{
			BufferedReader reader=new BufferedReader(new FileReader("details.txt"));
			int i=1;
			while((line=reader.readLine())!=null)
			{
				//Message.setText(Message.getText()+line.substring(7)+"\n"+Technicianname+"\n");
				if(line.contains(Technicianname))
				{
					if(i==1)
					{
						Message.setText(" Installations' information that done by "+Technicianname+ " is below:" + "\n\n");
					}
					Message.setText(Message.getText()+"  ("+i+")\n");
					//Message.setText(Message.getText()+"    "+line+"\n");
					line=reader.readLine();
					for(int j=0;j<6;j++)
					{
						line=reader.readLine();
						Message.setText(Message.getText()+"    "+line+"\n");
					}
					Message.setText(Message.getText()+"\n");
					i++;
				}
				else
				{
					for(int j=0;j<7;j++)
					{
						line=reader.readLine();
						//Message.setText(Message.getText()+"    "+line+"\n");
					}
				}
			}
			if(i==1)
			{
				JOptionPane.showMessageDialog(new JFrame(), "Any record with this technicianname is not found.", "Error", JOptionPane.ERROR_MESSAGE);//Message.setText("  Any record with name '"+Technicianname+"' is not found");
			}
			reader.close();
		}
		catch(FileNotFoundException ex) {
            System.out.println("Unable to open file");
        }
        catch(IOException ex) {
            System.out.println("Error reading file");
        }
    }
    public void write()
    {
    	 try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("cur_details.txt",true));
            //bufferedWriter.write("");

            bufferedWriter.write("Technician Name : "+txtName.getText());
            bufferedWriter.newLine();
            bufferedWriter.write("Contact no : "+txtContactNumber.getText());
            bufferedWriter.newLine();
            bufferedWriter.write("Addres : "+txtAddress.getText());
            bufferedWriter.newLine();
            bufferedWriter.write("Start date : "+txtstartDate.getText());
            bufferedWriter.newLine();
            bufferedWriter.write("End date : "+txtendDate.getText());
            bufferedWriter.newLine();
            bufferedWriter.write("Horse-power of AC : "+txtHorse_power.getText());
            bufferedWriter.newLine();
            bufferedWriter.write("Zones : "+txtZones.getText());
            bufferedWriter.newLine();
            bufferedWriter.write("Outlets : "+txtOutlets.getText());
            bufferedWriter.newLine();
            System.out.println("                            ");
    		appendLine();

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println("Error writing to file");
        }
    }
}

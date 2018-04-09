package grouptimetable;

import com.github.lgooddatepicker.optionalusertools.CalendarListener;
import com.github.lgooddatepicker.zinternaltools.CalendarSelectionEvent;
import com.github.lgooddatepicker.zinternaltools.YearMonthChangeEvent;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import static javax.swing.text.html.HTML.Tag.HEAD;

public class MainJFrame extends javax.swing.JFrame {
    public Database db = new Database();
    public String personListItem;
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        calendarPanel1.setSelectedDate(LocalDate.now());
        calendarPanel1.addCalendarListener(new SampleCalendarListener());
        //should return an object, so we can access name AND type (class name)
        this.personListItem = db.getFirstPersonInThePersonList();
        getTimetable(LocalDate.now().toString(), personListItem);
        getPersonList();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        calendarPanel1 = new com.github.lgooddatepicker.components.CalendarPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GroupTimetableProject");

        jPanel1.setName(""); // NOI18N

        jButton1.setText("Create Event");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel1.setText("Date here");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, calendarPanel1, org.jdesktop.beansbinding.ELProperty.create("${selectedDate.year}-${selectedDate.monthValue}-${selectedDate.dayOfMonth}"), jLabel1, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceNullValue("Select a date");
        bindingGroup.addBinding(binding);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Time", "Subject"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setRowHeight(32);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Day of week");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, calendarPanel1, org.jdesktop.beansbinding.ELProperty.create("${selectedDate.dayOfWeek.value}"), jLabel2, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel2PropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(67, 67, 67)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(605, 605, 605))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                .addContainerGap())
        );

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 925, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(calendarPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calendarPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        String selected = jList1.getSelectedValue();
        this.personListItem = selected;
        getTimetable(calendarPanel1.getSelectedDate().toString(), this.personListItem);
    }//GEN-LAST:event_jList1MouseClicked

    private void jLabel2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel2PropertyChange
        if(!jLabel2.getText().isEmpty())
        {
            if (jLabel2.getText().equals("1")) {
                jLabel2.setText("Monday");
            } else if (jLabel2.getText().equals("2")) {
                jLabel2.setText("Tuesday");
            } else if (jLabel2.getText().equals("3")) {
                jLabel2.setText("Wednesday");
            } else if (jLabel2.getText().equals("4")) {
                jLabel2.setText("Thursday");
            } else if (jLabel2.getText().equals("5")) {
                jLabel2.setText("Friday");
            } else if (jLabel2.getText().equals("6")) {
                jLabel2.setText("Saturday");
            } else if (jLabel2.getText().equals("7")) {
                jLabel2.setText("Sunday");
            }
        }
    }//GEN-LAST:event_jLabel2PropertyChange

    /* TO REMOVE */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NewEventJFrame newEvent = new NewEventJFrame();
        newEvent.setLocationRelativeTo(null);
        newEvent.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void addPersonToPersonList(List<Person> personList) {
        jList1.setModel(new DefaultListModel());
        DefaultListModel model = (DefaultListModel) jList1.getModel();
        for(Person p : personList){
            //check child classes here, MIFSAStudent is also a Student, so check first
            if (p instanceof Teacher) {
                model.addElement(p.getName()+" "+p.getLastName()+" [T]");
            } else if (p instanceof MIFSAStudent) {
                model.addElement(p.getName()+" "+p.getLastName()+" [SA]");
            } else if (p instanceof Student) {
                model.addElement(p.getName()+" "+p.getLastName()+" [S]");
            } 
        }    
        jList1.setModel(model);     
        jList1.setSelectedIndex(0);
    }
    public void getPersonList() {
        List<Person> personList = db.getPersonList();
        addPersonToPersonList(personList);
    }
    public void clearTimetable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
    }
    public void addEventsToTimetable(List<Event> eventList) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < eventList.size(); i++) {
            if(eventList.get(i) != null) {
                Event temp = eventList.get(i);
                Object[] obj = new Object[]{temp.getEventHourTime(), temp.getEventName()};
                model.addRow(obj);
            }     
	}
    }
    public List<Event> sortTimetableByEventStartTime(List<Event> list1, List<Event> list2) {
        list1.addAll(list2);
        Collections.sort(list1, new CustomComparator());
        return list1;
    }
    public void getTimetable(String date, String personListItem) {
        //get Person's class from [ ] and add it to the personList, get the name from the personListItem
        String personType = personListItem.substring(personListItem.indexOf("[") + 1, personListItem.indexOf("]"));
        String personName = personListItem.substring(0, personListItem.indexOf("[")-1);
        clearTimetable();
        List<Event> commonEventsOfTheDay = db.getCommonEventsOfTheDay(date);
        List<Event> personalEventsOfTheDay = db.getPersonalEventsOfTheDay(date, personName);
        //We can re-use a getPersonalEventsOfTheDay method in the Database class, and send a "SA" flag, so we can retrieve all mifsa events if it is a MIFSAStudent
                
        if (personType.equals("SA")){
            List<Event> sortedTimetable = sortTimetableByEventStartTime(commonEventsOfTheDay, personalEventsOfTheDay);
            List<Event> mifsaEventsOfTheDay = db.getPersonalEventsOfTheDay(date, personType);
            List<Event> sortedTimetable2 = sortTimetableByEventStartTime(mifsaEventsOfTheDay, sortedTimetable);
            addEventsToTimetable(sortedTimetable2);
        } else {
            List<Event> sortedTimetable = sortTimetableByEventStartTime(commonEventsOfTheDay, personalEventsOfTheDay);
            addEventsToTimetable(sortedTimetable);
        }
    }
    
    public class SampleCalendarListener implements CalendarListener {

        /**
         * selectedDateChanged, This function will be called each time that a date is selected in
         * the independent CalendarPanel. The new and old selected dates are supplied in the event
         * object. These parameters may contain null, which represents a cleared or empty date.
         *
         * By intention, this function will be called even if the user selects the same date value
         * twice in a row. This is so that the programmer can catch all events of interest.
         * Duplicate events can optionally be detected with the function
         * CalendarSelectionEvent.isDuplicate().
         */
        @Override
        public void selectedDateChanged(CalendarSelectionEvent event) {
            LocalDate oldDate = event.getOldDate();
            LocalDate newDate = event.getNewDate();
            getTimetable(newDate.toString(), personListItem);
        }
        @Override
        public void yearMonthChanged(YearMonthChangeEvent event) {
            /*YearMonth oldYearMonth = event.getOldYearMonth();
            YearMonth newYearMonth = event.getNewYearMonth();
            String oldYearMonthString = oldYearMonth.toString();
            String newYearMonthString = newYearMonth.toString();
            System.out.println(oldYearMonthString+" "+newYearMonthString);*/
        }
    }
    public class CustomComparator implements Comparator<Event> {
    @Override
    public int compare(Event e1, Event e2) {
        return e1.getEventHourTime().compareTo(e2.getEventHourTime());
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.CalendarPanel calendarPanel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

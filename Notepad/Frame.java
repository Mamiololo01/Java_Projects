import javax.swing.*;
import java.awt.event.KeyEvent;

public class Frame {
    public static JFrame frame;
    public static JTextArea textArea;

    public static void main(String [] args){
        createFrame();
        createTextArea();
        createMenu();
        frame.setVisible(true);
    }
    public static void createFrame(){
        frame = new JFrame("Notekeeper");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        ImageIcon = new ImageIcon("/Users/christopherozurumba/Desktop/notepad.png");
    }
    public static void createTextArea(){
        textArea = new JTextArea();
        frame.add(textArea);

        JScrollPane scrollBar = new JScrollPane(textArea);
        scrollBar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollBar.setBorder(BorderFactory.createEmptyBorder());
        frame.add(scrollBar);
    }
    public static void createMenu(){
        JMenuBar menu = new JMenuBar();
        frame.setJMenuBar(menu);

        JMenu filemenu = new JMenu("File");
        menu.add(filemenu);
        JMenu editmenu = new JMenu("Edit");
        menu.add(editmenu);
        JMenu formatmenu = new JMenu("Format");
        menu.add(formatmenu);

        // Creating File menu items and drop down list
        JMenuItem New = new JMenuItem("New");
        New.addActionListener(e -> FileMenu.newFile());
        filemenu.add(New);
        New.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));

        JMenuItem open = new JMenuItem("Open");
        open.addActionListener(e -> FileMenu.openFile());
        filemenu.add(open);
        open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));

        JMenuItem save = new JMenuItem("Save");
        save.addActionListener(e -> FileMenu.newFile());
        filemenu.add(save);
        save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));

        JMenuItem saveAs = new JMenuItem("Save AS ...");
        saveAs.addActionListener(e -> FileMenu.newFile());
        filemenu.add(saveAs);
        saveAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK |KeyEvent.SHIFT_DOWN_MASK));

        // Creating Edit menu items and drop down list
        JMenuItem cutItem = new JMenuItem("Cut");
        editmenu.add(cutItem);
        cutItem.addActionListener(e -> FileMenu.newFile());
        cutItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK));

        JMenuItem copyItem = new JMenuItem("Copy");
        editmenu.add(copyItem);
        copyItem.addActionListener(e -> FileMenu.newFile());
        copyItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK));

        JMenuItem pasteItem = new JMenuItem("Paste");
        editmenu.add(pasteItem);
        pasteItem.addActionListener(e -> FileMenu.newFile());
        pasteItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK));

        JMenuItem selectItem = new JMenuItem("Select All");
        editmenu.add(selectItem);
        selectItem.addActionListener(e -> FileMenu.newFile());
        selectItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_DOWN_MASK));


        // Creating File menu items and drop down list
        JMenuItem boldItem = new JMenuItem("Bold");
        boldItem.addActionListener(e -> FormatMenu.bold());
        formatmenu.add(boldItem);

        JMenuItem italicItem = new JMenuItem("Italic");
        italicItem.addActionListener(e -> FormatMenu.italic());
        formatmenu.add(italicItem);

        JMenuItem fontColorItem = new JMenuItem("Font Color");
        fontColorItem.addActionListener(e -> FormatMenu.fontColor());
        formatmenu.add(fontColorItem);


    }
}

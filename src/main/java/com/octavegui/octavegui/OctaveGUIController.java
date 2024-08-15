package com.octavegui.octavegui;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.awt.*;
import java.awt.Menu;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class OctaveGUIController implements Initializable {

    @FXML
    private Label scriptTextAreaLine;
    @FXML
    private Label scriptTextAreaColumn;
    @FXML
    public TextArea scriptTextArea;
    @FXML
    private MenuItem btnFindFiles;
    @FXML
    private MenuItem btnSetPath;
    @FXML
    private MenuItem btnPreferences;

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private TextField fieldDirectoryChooser;
    @FXML
    private TextField fieldDirectoryChooser1;

    @FXML
    private TreeView<File> treeView;

    @FXML
    private WebView docWebPage;
    private String link = "https://docs.octave.org/latest/";
    private WebEngine engine;


    @FXML
    private AnchorPane innerWindowTitleBarFileBrowser;
    @FXML
    private Label innerWindowTitleBarFileBrowserLabel;
    @FXML
    private ImageView innerWindowTitleBarFileBrowserMinimize;
    @FXML
    private ImageView innerWindowTitleBarFileBrowserX;


    @FXML
    private AnchorPane innerWindowTitleBarWorkspace;
    @FXML
    private Label innerWindowTitleBarWorkspaceLabel;
    @FXML
    private ImageView innerWindowTitleBarWorkspaceMinimize;
    @FXML
    private ImageView innerWindowTitleBarWorkspaceX;


    @FXML
    private AnchorPane innerWindowTitleBarCommandHistory;
    @FXML
    private Label innerWindowTitleBarCommandHistoryLabel;
    @FXML
    private ImageView innerWindowTitleBarCommandHistoryMinimize;
    @FXML
    private ImageView innerWindowTitleBarCommandHistoryX;


    @FXML
    private AnchorPane innerWindowTitleBarCommandWindow;
    @FXML
    private Label innerWindowTitleBarCommandWindowLabel;
    @FXML
    private ImageView innerWindowTitleBarCommandWindowMinimize;
    @FXML
    private ImageView innerWindowTitleBarCommandWindowX;


    @FXML
    private AnchorPane innerWindowTitleBarDocumentation;
    @FXML
    private Label innerWindowTitleBarDocumentationLabel;
    @FXML
    private ImageView innerWindowTitleBarDocumentationMinimize;
    @FXML
    private ImageView innerWindowTitleBarDocumentationX;


    @FXML
    private AnchorPane innerWindowTitleBarVariableEditor;
    @FXML
    private Label innerWindowTitleBarVariableEditorLabel;
    @FXML
    private ImageView innerWindowTitleBarVariableEditorMinimize;
    @FXML
    private ImageView innerWindowTitleBarVariableEditorX;


    @FXML
    private AnchorPane innerWindowTitleBarEditor;
    @FXML
    private Label innerWindowTitleBarEditorLabel;
    @FXML
    private ImageView innerWindowTitleBarEditorMinimize;
    @FXML
    private ImageView innerWindowTitleBarEditorX;


    @FXML
    private AnchorPane fileBrowserAnchorPane;
    @FXML
    private AnchorPane workspaceAnchorPane;
    @FXML
    private AnchorPane commandHistoryAnchorPane;
    @FXML
    private AnchorPane commandWindowAnchorPane;
    @FXML
    private AnchorPane documentationAnchorPane;
    @FXML
    private AnchorPane variableEditorWindowAnchorPane;
    @FXML
    private AnchorPane editorAnchorPane;


    @FXML
    private TabPane tabPaneNewFileEditor;
    @FXML
    private Button bttnNewFileEditor;
    @FXML
    private MenuButton fileHistoryMenuBttn;
    @FXML
    private MenuItem openDonateOctave;
    @FXML
    private MenuItem openContributeOctave;
    @FXML
    private MenuItem openPackagesOctave;
    @FXML
    private MenuItem openReportBug;

    @FXML
    private ListView<String> listView;
    ObservableList<String>list=(ObservableList<String>)FXCollections.observableArrayList("abs","accumarray","accumdim","acos","acosd","acosh","acot","acoth","acsc","acsch","addtodate","all","allchild","allfitdist","alldim","allfile","alphamask","and","ans","any","anymember","append","arc","arch_fit","arch_rnd","arch_test","argnames","argnchk","args","arma_rnd","arrayfun","asin","asind","asinh","assert","asserterror","assignin","atan","atan2","atan2d","atand","atanh","audioinfo","audioread","audiowrite","autumn","axes","axis","azimuth","backslash","balance","bar","bar3","barh","base2dec","base64decode","base64encode","beep","besselh","besseli","besselj","besselk","bessely","beta","betainc","betaincinv","betarnd","betaln","betalninv","binary","bincoeff","binomial","bitand","bitcmp","bitget","bitset","bitshift","bitor","bitpack","bitunpack","bitxor","blkdiag","blockproc","bode","booleval","box","boxplot","break","bsxfun","bug_report_url","builtins","builtin","calendar","case","cast","cat","catch","cd","cell","cell2mat","cell2struct","cellfun","cellplot","cfit","char","chdir","chebwin","check_functions_for_shadowed","chmod","chol","cholinc","cholupdate","circshift","clf","cliptest","clock","close","cmplxpair","colamd","colfun","colloc","colormap","colon","comet","command_editor","commandhistory","commit","complex","complex_diag","compound","cond","condest","conj","contour","contourf","contour3","contrast","conv","conv2","convhull","convn","cookie","cool","cooling","copyfile","cos","cosd","cosh","cot","cotd","coth","count","cov","cp2tform","cplxpair","crc","cross","cross2d","csc","csch","cumprod","cumsum","cwtft","cwt","daemon","date","datenum","datestr","datevec","dbclear","dbcont","dbdown","dbstack","dbstatus","dbstop","dbtype","dbup","dbwhere","dct","de2bi","deblank","debug_on_interrupt","dec2base","dec2bin","dec2hex","delete","demo","demos","det","diag","diary","diff","digital_filter","dir","dir_state","disp","display","dlmread","dlmwrite","dot","double","download","dsearchn","dspdata","dummy_error_function","dummy_optimizer","dummy_optimset","eig","eig_sym","eigvals","elseif","else","eml_get_default_compiler","eml_lib","eml_scalar_eg","empty","end","ends_with","engine_version","eps","erf","erfc","erfcinv","erfcx","erfi","erfinv","error","errorbar","errorbar3","errorbarxy","etree","eval","evalin","exist","exit","exp","expandpath","expm","exppdf","exprnd","expose_hidden_methods","eye","factor","factorial","factorize","false","fclose","feature","fft","fftfilt","fftn","fftshift","fieldnames","fieldnames_or_empty","fieldnames_plus","fields","fileattrib","filemarker","fileparts","filesep","fclose","fcol","feval","feof","ferror","fflush","fgetl","fgets","fill","fill3","filter","filter2","filterbank","find","findall","finddir","findfile","findobj","finish","fix","flip","fliplr","flipud","float","floatmax","floatmin","flops","flushinput","flushoutput","fmt","fopen","fprintf","fread","free","frexp","frewind","frewind","frewind","frewind","frewind","from_oct","fseek","fseek","fseek","ftell","ftell","ftell","ftell","ftell","full","fullfile","fullfact","funm","function_level","functions","fwrite","gamma","gammainc","gammaincinv","gammarnd","gcd","genalias","genpath","geod2cart","geodetic2ecef","get","get_dfa_chars","get_optim_pref","get_process_item","get_process_list","get_workspace_functions","get_workspace_variables","getenv","getfield","getgrent","getgrgid","getgrnam","getgroups","gethostid","gethostname","getitimer","getline","getlogin","getmaxopenfiles","getpgrp","getpid","getppid","getpwnam","getpwuid","getrusage","getshell","getsid","getsockname","getsockopt","getuid","getusershell","getw","global","globsearch","glpk","gplot","grad","grand","gray","graymon","grep","grid","griddata","griddata3","group","grp2idx","gzip","h5disp","h5dump","h5get_libversion","h5get_vds_error","h5get_vds_warning","h5read","h5readatt","h5readfields","h5readgroups","h5readstruct","h5write","h5writeatt","h5writestruct","hamming","handle","hankel","hashval","hdf5write","hdftool","help","hess","hex2dec","hex2num","hidden_stats_function","hide_error_backtrace","hide_error_message","hide_error_stack","hide_warnings","hist","histc","histeq","histfit","hls","hold","home","hopfieldnet","hopfieldnet1","hopfieldnet2","horzcat","hsv","hypot","iconv","idivide","ifft","ifft2","ifftn","imag","imagesc","imabsdiff","imadd","imcomplement","imconj","imcrop","imdataformats","imdiff","imdivide","imdtft","imequal","imfilter","imfuse","imgaussfilt","imguidedfilter","imhist","imhistmatch","imlincomb","imnoise","imopen","imphase","implay");


    @FXML
    protected void openFolderDirectory(ActionEvent event) {
        final DirectoryChooser dirchooser = new DirectoryChooser();

        Stage stage = (Stage) anchorPane.getScene().getWindow();
        File file = dirchooser.showDialog(stage);

        if (file != null) {
            System.out.println("Path: " + file.getAbsolutePath());
            fieldDirectoryChooser.setText(file.getAbsolutePath());
            fieldDirectoryChooser1.setText(file.getAbsolutePath());
        }

        populate();
    }
    @FXML
    private void closeApplication() {
        Platform.exit();
    }

    @FXML
    private void openFile() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files", "*.txt"));
        File selectedFile = fileChooser.showOpenDialog(null);
        if (selectedFile != null) {
            try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                String line;
                StringBuilder fileContent = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    fileContent.append(line).append("\n");
                }
                scriptTextArea.setText(fileContent.toString());
                MenuItem customItem = new MenuItem(selectedFile.getPath());
                fileHistoryMenuBttn.getItems().add(customItem);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listView.setItems(list);
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        Image minimizeIconLight = new Image("/images/widget-undock-light.png");
        Image minimizeIcon = new Image("/images/widget-undock.png");
        Image closeIconLight = new Image("/images/widget-close-light.png");
        Image closeIcon = new Image("/images/widget-close.png");

        engine = docWebPage.getEngine();
        engine.load(link);


        scriptTextArea.caretPositionProperty().addListener((observable, oldValue, newValue) -> {
            int caretPosition = newValue.intValue();

            // Get the text up to the caret position
            String text = scriptTextArea.getText(0, caretPosition);

            // Count the number of newline characters to determine the line number
            int lineNumber = 1;
            for (char c : text.toCharArray()) {
                if (c == '\n') {
                    lineNumber++;
                }
            }

            // Get the column number by subtracting the last newline position from the caret position
            int lastNewlinePosition = text.lastIndexOf('\n');
            int columnNumber = caretPosition - lastNewlinePosition;
            scriptTextAreaLine.setText("line: " + lineNumber);
            scriptTextAreaColumn.setText("col: " + columnNumber);
            //System.out.println("Line: " + lineNumber + ", Column: " + columnNumber);
        });





        fieldDirectoryChooser.setOnKeyPressed(keyEvent -> {
            if (keyEvent.getCode() == KeyCode.ENTER) {
                fieldDirectoryChooser1.setText(fieldDirectoryChooser.getText());
                populate();
            }
        });
        fieldDirectoryChooser1.setOnKeyPressed(keyEvent -> {
            if (keyEvent.getCode() == KeyCode.ENTER) {
                fieldDirectoryChooser.setText(fieldDirectoryChooser1.getText());
                populate();
            }
        });

        // Set event handler for innerWindowTitleBarFileBrowser
        fileBrowserAnchorPane.setOnMouseEntered(event -> {
            // Change background color to yellow on mouse enter
            innerWindowTitleBarFileBrowser.setStyle("-fx-background-color: linear-gradient(to bottom, #999999, #818081);");
            innerWindowTitleBarFileBrowserLabel.setStyle("-fx-text-fill: #ffffff;");
            innerWindowTitleBarFileBrowserMinimize.setImage(minimizeIconLight);
            innerWindowTitleBarFileBrowserX.setImage(closeIconLight);
        });
        fileBrowserAnchorPane.setOnMouseExited(event -> {
            // Change background color to yellow on mouse enter
            innerWindowTitleBarFileBrowser.setStyle("-fx-background-color: linear-gradient(to bottom, #e3e3e2, #c0c0c0);");
            innerWindowTitleBarFileBrowserLabel.setStyle("-fx-text-fill: #000000;");
            innerWindowTitleBarFileBrowserMinimize.setImage(minimizeIcon);
            innerWindowTitleBarFileBrowserX.setImage(closeIcon);
        });


        // Set event handler for innerWindowTitleBarWorkspace
        workspaceAnchorPane.setOnMouseEntered(event -> {
            // Change background color to yellow on mouse enter
            innerWindowTitleBarWorkspace.setStyle("-fx-background-color: linear-gradient(to bottom, #999999, #818081);");
            innerWindowTitleBarWorkspaceLabel.setStyle("-fx-text-fill: #ffffff;");
            innerWindowTitleBarWorkspaceMinimize.setImage(minimizeIconLight);
            innerWindowTitleBarWorkspaceX.setImage(closeIconLight);
        });
        workspaceAnchorPane.setOnMouseExited(event -> {
            // Change background color to yellow on mouse enter
            innerWindowTitleBarWorkspace.setStyle("-fx-background-color: linear-gradient(to bottom, #e3e3e2, #c0c0c0);");
            innerWindowTitleBarWorkspaceLabel.setStyle("-fx-text-fill: #000000;");
            innerWindowTitleBarWorkspaceMinimize.setImage(minimizeIcon);
            innerWindowTitleBarWorkspaceX.setImage(closeIcon);
        });


        // Set event handler for innerWindowTitleBarCommandHistory
        commandHistoryAnchorPane.setOnMouseEntered(event -> {
            // Change background color to yellow on mouse enter
            innerWindowTitleBarCommandHistory.setStyle("-fx-background-color: linear-gradient(to bottom, #999999, #818081);");
            innerWindowTitleBarCommandHistoryLabel.setStyle("-fx-text-fill: #ffffff;");
            innerWindowTitleBarCommandHistoryMinimize.setImage(minimizeIconLight);
            innerWindowTitleBarCommandHistoryX.setImage(closeIconLight);
        });
        commandHistoryAnchorPane.setOnMouseExited(event -> {
            // Change background color to yellow on mouse enter
            innerWindowTitleBarCommandHistory.setStyle("-fx-background-color: linear-gradient(to bottom, #e3e3e2, #c0c0c0);");
            innerWindowTitleBarCommandHistoryLabel.setStyle("-fx-text-fill: #000000;");
            innerWindowTitleBarCommandHistoryMinimize.setImage(minimizeIcon);
            innerWindowTitleBarCommandHistoryX.setImage(closeIcon);
        });

        // Set event handler for innerWindowTitleBarCommandWindow
        commandWindowAnchorPane.setOnMouseEntered(event -> {
            // Change background color to yellow on mouse enter
            innerWindowTitleBarCommandWindow.setStyle("-fx-background-color: linear-gradient(to bottom, #999999, #818081);");
            innerWindowTitleBarCommandWindowLabel.setStyle("-fx-text-fill: #ffffff;");
            innerWindowTitleBarCommandWindowMinimize.setImage(minimizeIconLight);
            innerWindowTitleBarCommandWindowX.setImage(closeIconLight);
        });
        commandWindowAnchorPane.setOnMouseExited(event -> {
            // Change background color to yellow on mouse enter
            innerWindowTitleBarCommandWindow.setStyle("-fx-background-color: linear-gradient(to bottom, #e3e3e2, #c0c0c0);");
            innerWindowTitleBarCommandWindowLabel.setStyle("-fx-text-fill: #000000;");
            innerWindowTitleBarCommandWindowMinimize.setImage(minimizeIcon);
            innerWindowTitleBarCommandWindowX.setImage(closeIcon);
        });

        // Set event handler for innerWindowTitleBarDocumentation
        documentationAnchorPane.setOnMouseEntered(event -> {
            // Change background color to yellow on mouse enter
            innerWindowTitleBarDocumentation.setStyle("-fx-background-color: linear-gradient(to bottom, #999999, #818081);");
            innerWindowTitleBarDocumentationLabel.setStyle("-fx-text-fill: #ffffff;");
            innerWindowTitleBarDocumentationMinimize.setImage(minimizeIconLight);
            innerWindowTitleBarDocumentationX.setImage(closeIconLight);
        });
        documentationAnchorPane.setOnMouseExited(event -> {
            // Change background color to yellow on mouse enter
            innerWindowTitleBarDocumentation.setStyle("-fx-background-color: linear-gradient(to bottom, #e3e3e2, #c0c0c0);");
            innerWindowTitleBarDocumentationLabel.setStyle("-fx-text-fill: #000000;");
            innerWindowTitleBarDocumentationMinimize.setImage(minimizeIcon);
            innerWindowTitleBarDocumentationX.setImage(closeIcon);
        });

        // Set event handler for innerWindowTitleBarVariableEditor
        variableEditorWindowAnchorPane.setOnMouseEntered(event -> {
            // Change background color to yellow on mouse enter
            innerWindowTitleBarVariableEditor.setStyle("-fx-background-color: linear-gradient(to bottom, #999999, #818081);");
            innerWindowTitleBarVariableEditorLabel.setStyle("-fx-text-fill: #ffffff;");
            innerWindowTitleBarVariableEditorMinimize.setImage(minimizeIconLight);
            innerWindowTitleBarVariableEditorX.setImage(closeIconLight);
        });
        variableEditorWindowAnchorPane.setOnMouseExited(event -> {
            // Change background color to yellow on mouse enter
            innerWindowTitleBarVariableEditor.setStyle("-fx-background-color: linear-gradient(to bottom, #e3e3e2, #c0c0c0);");
            innerWindowTitleBarVariableEditorLabel.setStyle("-fx-text-fill: #000000;");
            innerWindowTitleBarVariableEditorMinimize.setImage(minimizeIcon);
            innerWindowTitleBarVariableEditorX.setImage(closeIcon);
        });

        // Set event handler for innerWindowTitleBarEditor
        editorAnchorPane.setOnMouseEntered(event -> {
            // Change background color to yellow on mouse enter
            innerWindowTitleBarEditor.setStyle("-fx-background-color: linear-gradient(to bottom, #999999, #818081);");
            innerWindowTitleBarEditorLabel.setStyle("-fx-text-fill: #ffffff;");
            innerWindowTitleBarEditorMinimize.setImage(minimizeIconLight);
            innerWindowTitleBarEditorX.setImage(closeIconLight);
        });
        editorAnchorPane.setOnMouseExited(event -> {
            // Change background color to yellow on mouse enter
            innerWindowTitleBarEditor.setStyle("-fx-background-color: linear-gradient(to bottom, #e3e3e2, #c0c0c0);");
            innerWindowTitleBarEditorLabel.setStyle("-fx-text-fill: #000000;");
            innerWindowTitleBarEditorMinimize.setImage(minimizeIcon);
            innerWindowTitleBarEditorX.setImage(closeIcon);
        });

        openDonateOctave.setOnAction(event -> {
            try {
                Desktop.getDesktop().browse(new URI("https://octave.org/donate.html"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        openContributeOctave.setOnAction(event -> {
            try {
                Desktop.getDesktop().browse(new URI("https://octave.org/get-involved"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        openPackagesOctave.setOnAction(event -> {
            try {
                Desktop.getDesktop().browse(new URI("https://gnu-octave.github.io/packages/index.html"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });
        openReportBug.setOnAction(event -> {
            try {
                Desktop.getDesktop().browse(new URI("https://octave.org/support"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });




    }

    public void loadPage() {
        engine.load("https://docs.octave.org/latest/");
    }


    @FXML
    public void populate() {
        // todo check for the right assginment
        // todo handle error
        try {

            ImageView imageView = new ImageView("D:\\Facultate\\PIUG(P)\\IntelliJ\\OctaveGUI\\src\\main\\resources\\images\\folder.png");
            imageView.setFitHeight(15);
            imageView.setFitWidth(15);

            treeView.setRoot(createNode(new File(fieldDirectoryChooser.getText()), imageView));
            treeView.setRoot(createNode(new File(fieldDirectoryChooser1.getText()), imageView));

            treeView.setCellFactory(new Callback<TreeView<File>, TreeCell<File>>() {

                public TreeCell<File> call(TreeView<File> tv) {
                    return new TreeCell<File>() {
                        private final ImageView imageView = new ImageView();

                        @Override
                        protected void updateItem(File item, boolean empty) {
                            super.updateItem(item, empty);
                            //setText((empty || item == null) ? "" : item.getName());

                            if (empty || item == null) {
                                setText(null);
                                setGraphic(null);
                            } else {
                                setText(item.getName());
                                if (item.isDirectory()) {
                                    imageView.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/folder.png"))));
                                    imageView.setFitHeight(15);
                                    imageView.setFitWidth(15);
                                } else {
                                    imageView.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/file_icon.png"))));
                                    imageView.setFitHeight(15);
                                    imageView.setFitWidth(15);
                                }
                                setGraphic(imageView);
                            }

                        }

                    };
                }
            });

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private TreeItem<File> createNode(final File f, ImageView imageView) throws FileNotFoundException {
        return new TreeItem<File>(f, imageView) {
            private boolean isLeaf;
            private boolean isFirstTimeChildren = true;
            private boolean isFirstTimeLeaf = true;

            @Override
            public ObservableList<TreeItem<File>> getChildren() {
                if (isFirstTimeChildren) {
                    isFirstTimeChildren = false;

                    try {
                        super.getChildren().setAll(buildChildren(this));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
                return super.getChildren();
            }

            @Override
            public boolean isLeaf() {
                if (isFirstTimeLeaf) {
                    isFirstTimeLeaf = false;
                    File f = (File) getValue();
                    isLeaf = f.isFile();
                }

                return isLeaf;
            }

            private ObservableList<TreeItem<File>> buildChildren(TreeItem<File> TreeItem) throws FileNotFoundException {

                File f = TreeItem.getValue();
                if (f != null && f.isDirectory()) {
                    File[] files = f.listFiles();
                    if (files != null) {
                        ObservableList<TreeItem<File>> children = FXCollections.observableArrayList();

                        for (File childFile : files) {
                            if (childFile.isFile()) {
                                ImageView imageView = new ImageView();
                                imageView.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/folder.png"))));
                                imageView.setFitHeight(15);
                                imageView.setFitWidth(15);
                                //System.out.println(children);
                                children.add(createNode(childFile, imageView));

                            } else {
                                ImageView imageView = new ImageView();
                                imageView.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/folder.png"))));
                                imageView.setFitHeight(15);
                                imageView.setFitWidth(15);
                                //System.out.println(children);
                                children.add(createNode(childFile, imageView));
                            }

                        }
                        return children;
                    }
                }

                return FXCollections.emptyObservableList();
            }
        };
    }

    @FXML
    private void addTab() {
        int numTabs = tabPaneNewFileEditor.getTabs().size();
        Tab tab = new Tab("<unnamed_"+(numTabs)+">");
        tabPaneNewFileEditor.getTabs().add(tab);
    }


    public void handleBtnFindFiles(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(OctaveGUIApplication.class.getResource("windowFindFiles.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("findFiles.css")).toExternalForm());

        Stage stage = new Stage();
        stage.setTitle("Find Files");
        stage.getIcons().add(new Image("/images/edit-find.png"));
        stage.setResizable(false);

        stage.setScene(scene);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(btnPreferences.getParentPopup().getOwnerWindow());
        stage.show();
    }

    public void handleBtnPreferences(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(OctaveGUIApplication.class.getResource("windowPreferences.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 400);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("preferences.css")).toExternalForm());

        Stage stage = new Stage();
        stage.setTitle("Preferences");
        stage.getIcons().add(new Image("/images/logo.png"));
        stage.setResizable(false);

        stage.setScene(scene);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(btnFindFiles.getParentPopup().getOwnerWindow());
        stage.show();
    }

    public void handleBtnSetPath(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(OctaveGUIApplication.class.getResource("setPath.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 430, 270);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("setPath.css")).toExternalForm());

        Stage stage = new Stage();
        stage.setTitle("Set Path");
        stage.getIcons().add(new Image("/images/logo.png"));
        stage.setResizable(false);

        stage.setScene(scene);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(btnSetPath.getParentPopup().getOwnerWindow());
        stage.show();
    }

    public void handleBtnReleaseNotes(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(OctaveGUIApplication.class.getResource("releaseNotes.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 430, 270);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("releaseNotes.css")).toExternalForm());

        Stage stage = new Stage();
        stage.setTitle("Octave Release Notes");
        stage.getIcons().add(new Image("/images/logo.png"));
        stage.setResizable(false);

        stage.setScene(scene);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(btnSetPath.getParentPopup().getOwnerWindow());
        stage.show();
    }

}
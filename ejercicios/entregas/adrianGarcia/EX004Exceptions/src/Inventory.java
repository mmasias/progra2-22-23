package com.progra.inventory;
import com.progra.inventory.exceptions.FullStorageException;
import java.io.*;
import java.util.ArrayList;
public class Inventory implements  IInventory{
    int capacity = 0;
    ArrayList<String> items;

    public Inventory() {
        this.capacity = 10;
        this.items = new ArrayList<String>();}
    public Inventory(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<String>();}
    @Override
    public void setItem(String val) throws FullStorageException {
        if(hasAvailableStorage()){
            this.items.add(val);}
        else {
            throw new FullStorageException("No space left");}}
    public void addItem(String val) throws FullStorageException {
        this.setItem(val);}
    @Override
    public ArrayList<String> getItems() {
        return this.items;}
    private Boolean hasAvailableStorage(){
        return this.items.size() < this.capacity ? true: false;}
    public void showItems(){
        for(String item: this.items){
            System.out.println(item);}}
    public void loadItems(ArrayList<String> data){
        for(String item: data){
            try {
                this.setItem(item);
            } catch (FullStorageException e) {
                System.err.println(e.getMessage());}}}
    public void LoadItemsFromFile(String fileName){
        File file = new File(fileName);
        if(file.exists()){
            String line = "";
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                while((line = br.readLine()) != null){
                    try {
                        this.setItem(line);
                    } catch (FullStorageException e) {
                        System.err.println(e.getMessage());}}
                br.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);}}}}
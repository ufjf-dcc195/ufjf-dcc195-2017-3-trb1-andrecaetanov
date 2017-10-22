package com.example.andre.trb1;

import android.os.Parcel;
import android.os.Parcelable;

class Participante implements Parcelable {
    private String nome;
    private String email;

    Participante(Parcel in) {
        nome = in.readString();
        email = in.readString();
    }

    Participante(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nome);
        dest.writeString(email);
    }

    public static final Creator<Participante> CREATOR = new Creator<Participante>() {
        @Override
        public Participante createFromParcel(Parcel in) {
            return new Participante(in);
        }

        @Override
        public Participante[] newArray(int size) {
            return new Participante[size];
        }
    };

    @Override
    public String toString() {
        return nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void setEmail(String email) {
        this.email = email;
    }
}
